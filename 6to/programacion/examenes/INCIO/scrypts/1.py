import geopandas as gpd
from sqlalchemy import create_engine
db_connection_url = "postgresql://postgres:postgres@localhost:5432/unid2"
engine = create_engine(db_connection_url)
connection = engine.connect()
sql = f"create extension postgis;"
connection.execute(sql)
sql = f"create schema esta;"
connection.execute(sql)

connection.close()