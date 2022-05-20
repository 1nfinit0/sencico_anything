from sqlalchemy import create_engine
import pandas

# Función que devuelve los recursos de conección
def datosdeconexion_db():
    return['unid2', 'tobi', 'posttobi']

# Función que ejecuta el query
def subida():
    url=datosdeconexion_db()
    coneccion = create_engine('postgresql://'+url[1]+':'+url[2]+'@localhost/'+url[0])
    lectura = pandas.read_csv('/home/tobi/examenes/examen/SEMAP_ESTA.csv')
    lectura.to_sql(con=coneccion, schema='esta', name='semap_esta', if_exists='replace')

    conexion=coneccion.connect()

    sql = 'ALTER TABLE IF EXISTS esta.samap_esta ADD PRIMARY KEY ("V_COD_ESTA");'
    conexion.execute(sql)
    sql = 'ALTER TABLE IF EXISTS esta.samap_esta DROP COLUMN IF EXISTS index;'
    conexion.execute(sql)
    
    conexion.close()

    return "Succses!!"

# Ejecución
print(subida())