from sqlalchemy import create_engine
import pandas
engine = create_engine('postgresql://postgres:postgres@localhost:5432/unid2')
gdf = pandas.read_csv('C:\examen\SEMAP_ESTA.csv')

gdf.columns = ["V_COD_ESTA","V_COD_TIPO","V_COD_ANESTA","V_NOM_ESTA","V_COD_CUEN","V_COD_CATE","V_COD_PROV","V_COD_DEP","V_COD_DIST","V_COD_ENTI","V_COD_DRE","N_LON_GRAD","N_LON_MIN","N_LON_SEG","N_LON_SIG","N_LAT_GRAD","N_ALT_MTS","N_LAT_MIN","N_LAT_SEG","N_LAT_SIG","V_COD_COND","V_SUB_ESTA","V_CLAS_ESTA","V_COD_ZONA","V_COD_CUENCA","V_NOM_CUENCA","V_COD_POSTAL","N_MIN_HELADA","N_MAX_HELADA"]
print(gdf.dtypes)
esquema="esta"
tabla="semap esta"
connection = engine.connect()
sql = f"INSERT INTO {esquema}.{tabla} ({gfd});"
connection.execute(sql)


connection.close()