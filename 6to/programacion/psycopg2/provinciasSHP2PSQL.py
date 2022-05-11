import geopandas
from sqlalchemy import create_engine

#Lectura del archivo shape por geopandas
fileinput = '/mnt/d/tobisthings/sencico/progrmacion/shp/provincias.shp'
shp = geopandas.read_file(fileinput)
# Variables para la conexión
user = 'postgres'
password = 'postgres'
database = 'demo'
db_connection_url = 'postgresql://'+user+':'+password+'@localhost:5432/'+database
engine = create_engine(db_connection_url)
shp.to_postgis(schema='dbcarto_fundamento', name='provincias', con=engine)
