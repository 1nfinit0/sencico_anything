import geopandas as gpd
from sqlalchemy import create_engine
db_connection_url = "postgresql://postgres:postgres@localhost:5432/unid2"
engine = create_engine(db_connection_url)
connection = engine.connect()
sql = f'alter table esta.semap_esta add column geom geometry(point,4326)'
connection.execute(sql)
sql = f'update esta.semap_esta set geom = ST_SetSRID(ST_MakePoint("N_LON_SIG","N_LAT_SIG"),4326);'
connection.execute(sql)

connection.close()