"""
Fecha: Mayo 2022
Autor: Luis Huatay
Descripción: Crearemos, leeremos, actualizaremos y borraremos registros en postgresql (con las dos librerías)
"""

"""
    A partir de aquí para efectuar los scripts sql los ejecutaremos desde archivos separados
    es decir, no escribiremos las consultas sql embebido en el script y las llamaremos desde la
    carpeta ../sql/pysql/nombre_archivo.sql
"""

# Importar librerías
import psycopg2
from sqlalchemy import create_engine

# Definimos las variables de conexión
host = "localhost"
port = "5432"
dbname = "tobi"
user = "dbatobi"
password = "posttobi"

"""
    -------------------------- Creación de la tabla con psycopg2 -------------------------- ARREGLAR CON UNA FUNCIÓN!!!
"""
sql = ""
try: # Apartir de aquí se define la conexión
    connection = psycopg2.connect(
        host=host,
        port=port,
        dbname=dbname,
        user=user,
        password=password
    )
    cursor=connection.cursor() # Se crea un cursor para poder ejecutar las consultas
    
    print("\nSuccess!\n") # Esto hará si todo salío bien
except Exception as e: # Esto define el comportamiento si falla la conexión
    print("Error al conectar con PostgreSQL: ", e) # Esto hará si falla
finally: # Esto hará siempre porque tiene que cerrar la conexión o se generarán varias sesion en psql (revisar ../sql/1_psql.sql)
    if connection:
        cursor.close() # Se cierra el cursor
        connection.close() # Se cierra la conexión



    