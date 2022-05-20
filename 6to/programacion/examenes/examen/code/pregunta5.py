import psycopg2

# Función que devuelve los recursos de conección
def datosdeconexion_db():
    return['unid2', 'tobi', 'posttobi']

# Función que ejecuta el query
def createindex():
    url=datosdeconexion_db()
    conn=psycopg2.connect(database=url[0],user=url[1],password=url[2])
    prompt=conn.cursor()
    prompt.execute('CREATE INDEX geom ON esta.semap_esta USING gist(geom)')
    conn.commit()
    prompt.close()
    conn.close()
    return "Éxito"

# Ejecución
print(createindex())