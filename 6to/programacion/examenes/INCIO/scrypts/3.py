from sqlalchemy import create_engine
import pandas
engine = create_engine('postgresql://postgres:postgres@localhost:5432/unid2')
gdf = pandas.read_csv('C:\examen\SEMAP_ESTA.csv')
gdf.to_sql(con=engine, if_exists='replace', schema=esquema, name=tabla)
connection=engine.connect()
sql = 'alter table esta.samap_esta add primary key ("V_COD_ESTA");'
connection.execute(sql)
    
connection.close()