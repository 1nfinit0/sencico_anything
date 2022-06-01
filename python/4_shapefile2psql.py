"""
Fecha: Junio 2022
Autor: Luis Huatay
Descripción: Crearemos, leeremos, actualizaremos y borraremos registros en postgresql (Con la librería sqlalchemy)
"""
"""
    Como ya se vió hay dos formas de ejecutar sentencias sql a postgresql desde python y por lo visto
    ahora psycopg2 lleva ventaja ya que permite la ejecución de archivos sql con varias sentencias que puedes
    ejecutarse en una sola conexión. Sin embargo SqlAlchemy tiene la gran ventaja de trabajar en conjunto
    con la librería de Geopandas que permite trabajar con archivos shape, ded heecho eso los hace complementarios el 
    uno al otro.
"""
"""
    --------------- Función para subir Shapefile a postgresql con SqlAlchemy y Geopandas --------------- (arregla la necesdidad de colocar columnas)
"""
# Importamos librerías
import geopandas as gpd
from sqlalchemy import create_engine

# Definimos las variables de conexión
host = "localhost"
port = "5432"
dbname = "tobi"
user = "dbatobi"
password = "posttobi"

# Función que sube un archivo shape a postgresql
def upShapefile2psql(shapefile, table_name, schema_name):
    try:
        db_connection_url = f"postgresql://{user}:{password}@{host}:{port}/{dbname}" # Definimos la dirección de conección
        engine = create_engine(db_connection_url) # Creamos el motor de conección
        gdf = gpd.read_file(shapefile) # Leemos el archivo shape
        gdf = gdf.to_crs("EPSG:4326") # Convertimos el archivo shape a coordenadas de referencia WGS84
        gdf.dtypes
        gdf.columns = ['ubigeo','distrito','provincia','departamento','poblacion','superficie','geometry']
        #gdf.columns = ['codigo_pos','capitales','distritos','provincia','departamen','geometry']
        gdf.to_postgis(if_exists='replace', schema=schema_name, name=table_name, con=engine) # Subimos el archivo shape a postgresql
        print("\nShapefile subido a postgresql con éxito\n")
    except Exception as e:
        print("Log: ", e)

# Ejecución de la función
upShapefile2psql('../files/shapefiles/ubigeo_inei/geodir_ubigeo_inei.shp', 'geodir_codigo_postal', 'prueba')

