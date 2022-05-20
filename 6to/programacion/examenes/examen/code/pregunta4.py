import psycopg2

# Función que devuelve los recursos de conección
def datosdeconexion_db():
    return['unid2', 'tobi', 'posttobi']

# Función que ejecuta el query
def creategeom():
    url=datosdeconexion_db()
    conn=psycopg2.connect(database=url[0],user=url[1],password=url[2])
    prompt=conn.cursor()
    prompt.execute('ALTER TABLE esta.semap_esta ADD COLUMN geom geometry(point,4326)')
    prompt.execute('UPDATE esta.semap_esta set geom = ST_SetSRID(ST_MakePoint("N_LON_SIG","N_LAT_SIG"),4326)')
    conn.commit()
    prompt.close()
    conn.close()
    return "Éxito"

# Ejecución
print(creategeom())