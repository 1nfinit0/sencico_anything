import geopandas as gpd
from sqlalchemy import create_engine

db_connection_url = "postgresql://tobi:posttobi@localhost:5432/unid2"
engine = create_engine(db_connection_url)
gdf = gpd.read_file("/home/tobi/examenes/examen/shp/descargas/geodir_ubigeo_inei.shp")
gdf = gdf.to_crs("EPSG:4326")

gdf.columns = ['ubigeo','distrito','provincia','departamento','poblacion','superficie','geometry']
print(gdf.dtypes)

esquema="esta"
tabla="geodir_ubigeo_inei"

gdf.to_postgis(con=engine, if_exists='replace', schema=esquema, name=tabla)


db_connection_url = "postgresql://tobi:posttobi@localhost:5432/unid2"
engine = create_engine(db_connection_url)
gdf = gpd.read_file("/home/tobi/examenes/examen/shp/descargas/geodir_codigo_postal.shp")
gdf = gdf.to_crs("EPSG:4326")

gdf.columns = ['codigo','distrito','provincia','departamento','poblacion','superficie','geometry']
print(gdf.dtypes)

esquema="esta"
tabla="geodir_codigo_postal"

gdf.to_postgis(con=engine, if_exists='replace', schema=esquema, name=tabla)