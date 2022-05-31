"""
Fecha: Mayo 2022
Autor: Luis Huatay
Descripción: Crearemos, leeremos, actualizaremos y borraremos registros en postgresql (con la librería psycopg2)
"""

"""
    A partir de aquí para efectuar los scripts sql los ejecutaremos desde archivos separados
    es decir, no escribiremos las consultas sql embebido en el script y las llamaremos desde la
    carpeta ../sql/pysql/nombre_archivo.sql
"""

# Importar librerías
import psycopg2
import pandas as pd

# Definimos las variables de conexión
host = "localhost"
port = "5432"
dbname = "tobi"
user = "dbatobi"
password = "posttobi"

"""
    -------------------------- Creación de una función que ejecute sentencias sql --------------------------
"""
# Definimos una función que permita ejecutar un scipt sql (como argumento le proporcionamos la ubicación del archivo)
def execute_file_sql(script):
    try: # Apartir de aquí se define la conexión
        connection = psycopg2.connect(
            host=host,
            port=port,
            dbname=dbname,
            user=user,
            password=password
        )
        print("\nConexión con psycopg2 a Postgresql realizada con éxito\n") # Esto hará si la conexión es exitosa
        # Abrimos el archivo que contiene las sentencias sql
        with open(script, "r") as f:
            script_now_sql = f.read() # Leemos el contenido del archivo y lo guardamos en esa variable
        with connection.cursor() as cursor: # Con esto podemos ejecutar las consultas sql
            cursor.execute(script_now_sql) # Ejecutamos el script sql
            print("Query ejecutada con éxito")
            if cursor.rowcount > 0:
                print("Registros afectados: ", cursor.rowcount)
                result = cursor.fetchall()
                df = pd.DataFrame(result)
                print(df)
    except Exception as e: # Esto define el comportamiento si falla la conexión
        print("Log: ", e) # Esto hará si falla
    finally: # Esto hará siempre porque tiene que cerrar la conexión o se generarán varias sesion en psql (revisar ../sql/1_psql.sql)
        if connection:
            connection.commit() # Con esto guardamos los cambios
            cursor.close() # Con esto cerramos el cursor
            connection.close() # Cierra la conexión

"""
    Ejecutamos la función que declaramos arriba para ejecutar sentencias sql
"""
execute_file_sql("../sql/pysql/psycopg2_create2psql.sql") # Crea la tabla
#execute_file_sql("../sql/pysql/psycopg2_select2psql.sql") # Consulta el contenido de la tabla
#execute_file_sql("../sql/pysql/psycopg2_update2psql.sql") # Actualiza registros en la tabla
#execute_file_sql("../sql/pysql/psycopg2_delete2psql.sql") # Borra registros en la tabla