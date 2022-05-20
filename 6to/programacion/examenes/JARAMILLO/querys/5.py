import geopandas as gpd
from sqlalchemy import create_engine
db_connection_url = "postgresql://postgres:postgres@localhost:5432/unid2"
engine = create_engine(db_connection_url)
connection = engine.connect()
sql = f'CREATE INDEX geom ON esta.semap_esta USING gist(geom);'
connection.execute(sql)

connection.close()