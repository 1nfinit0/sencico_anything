#Convertir shape a postgis
#=========================
import geopandas as gpd
from sqlalchemy import create_engine

db_connection_url = "postgresql://postgres:postgres@localhost:5432/demo"
engine = create_engine(db_connection_url)
gdf = gpd.read_file("./postales/geodir_ubigeo_inei.shp")
gdf = gdf.to_crs("EPSG:4326")

gdf.columns = ['ubigeo','distrito','provincia','departamento','poblacion','superficie','geometry']
print(gdf.dtypes)

esquema="dbcarto_fundamento"
tabla="geodir_ubigeo_inei"

gdf.to_postgis(con=engine, if_exists='replace', schema=esquema, name=tabla)

connection = engine.connect()

sql = f"ALTER TABLE {esquema}.{tabla} ALTER COLUMN ubigeo TYPE varchar(6) USING ubigeo;"
connection.execute(sql)

sql = f"ALTER TABLE {esquema}.{tabla} ALTER COLUMN distrito TYPE varchar(60) USING distrito;"
connection.execute(sql)

sql = f"ALTER TABLE {esquema}.{tabla} ALTER COLUMN provincia TYPE varchar(60) USING provincia;"
connection.execute(sql)

sql = f"ALTER TABLE {esquema}.{tabla} ALTER COLUMN departamento TYPE varchar(60) USING departamento;"
connection.execute(sql)

sql = f"ALTER TABLE {esquema}.{tabla} ALTER COLUMN poblacion TYPE integer USING poblacion::integer;"
connection.execute(sql)

sql = f"UPDATE {esquema}.{tabla} SET geometry=ST_Multi(geometry) WHERE GeometryType(geometry)<>'MULTIPOLYGON';"
connection.execute(sql)

sql = f"ALTER TABLE {esquema}.{tabla} ALTER COLUMN geometry TYPE geometry(MultiPolygon,4326) USING geometry;"
connection.execute(sql)

sql = f'ALTER TABLE IF EXISTS {esquema}.{tabla} RENAME geometry TO geom;'
connection.execute(sql)

connection.close()