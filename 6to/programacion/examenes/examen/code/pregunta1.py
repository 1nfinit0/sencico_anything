import psycopg2

# Función que devuelve los recursos de conección
def datosdeconexion_db():
    return['unid2', 'tobi', 'posttobi']

# Función que ejecuta el query
def createschema():
    url=datosdeconexion_db()
    conn=psycopg2.connect(database=url[0],user=url[1],password=url[2])
    prompt=conn.cursor()
    prompt.execute("CREATE EXTENSION postgis")
    prompt.execute("CREATE SCHEMA esta")
    conn.commit()
    prompt.close()
    conn.close()
    return "Éxito"

# Ejecución
print(createschema())