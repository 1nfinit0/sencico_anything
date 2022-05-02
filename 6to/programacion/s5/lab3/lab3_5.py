import psycopg2

def resources_db():
    return ['lab3','tobi','tobispassword']
    
def exe_sql(sql):
    connection = None
    try:
        db = resources_db()
        connection = psycopg2.connect(database=db[0],user=db[1],password=db[2])
        cursor = connection.cursor()
        cursor.execute(sql)
        connection.commit()
    except (Exception, psycopg2.DatabaseError) as error: print ("Error... ", error)
    finally:
        if(connection):
            cursor.close()
            connection.close()
    return
#---------------------------

sql = "" 
try:
    fichero = open("copy.sql")
    for linea in fichero: sql = sql + linea
    fichero.close()
except Exception as e:
    print("No se puede aperturar el archivo ", e)

print(sql)
exe_sql(sql)
