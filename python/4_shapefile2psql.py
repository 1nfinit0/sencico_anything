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
        gdf.to_postgis(if_exists='replace', schema=schema_name, name=table_name, con=engine) # Subimos el archivo shape a postgresql
        print("\nShapefile subido a postgresql con éxito\n")
    except Exception as e:
        print("Log: ", e)

# Ejecución de la función
upShapefile2psql('../files/shapefiles/ubigeo_inei/geodir_ubigeo_inei.shp', 'geodir_ubigeo_inei', 'prueba')

"""
    Aquí existe una excepción CON ESTE ARCHIVO ya que con el anterior si sube pero este no, existen
    posibles causas que pueden ser:
        - Existe geometría superpuesta en el archivo (no es posible ya que el archivo de inei también las tiene pero si sube)
        - Tiene geometría no valida (También no es posible ya que el archivo de inei también las tiene y aún así sube)
        - Cuando tenga otra idea la pondré aquí
        - El encoding no es utf-8 (causa probable)

    Para subir el archivo de todas formas usar la herramienta shp2pgsql de postgis (su uso está en ../sql/6_shp2pgsql.sh)
    NOTA: Al subir este archivo se usó shp2pgsql -W "LATIN1" si no pues no sube xd (Quizá ese sea el problema)
    shp2pgsql -s 4326 -I -d -g geom -W "LATIN1" ../files/shapefiles/cod_postal/geodir_cod_postal.shp prueba.geodir_cod_postal | psql -d tobi -U dbatobi -W
"""

#upShapefile2psql('../files/shapefiles/cod_postal/geodir_cod_postal.shp', 'geodir_cod_postal', 'prueba')