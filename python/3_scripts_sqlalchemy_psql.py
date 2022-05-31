"""
Fecha: Mayo 2022
Autor: Luis Huatay
Descripción: Crearemos, leeremos, actualizaremos y borraremos registros en postgresql (Con la librería sqlalchemy)
"""

"""
    SqlAlchemy no tiene posible la posibilidad de ejecutar un archivo con muchas sentencias sql por lo que se debe
    escribir una sentencia a la vez dentro de la función que crearemos
"""
# Importar librerías
from sqlalchemy import create_engine
from sqlalchemy import text
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

def execute_file_sql(sql):
    resource_db = f"postgresql://{user}:{password}@{host}:{port}/{dbname}" # Definimos la dirección de conección
    engine = create_engine(resource_db) # Creamos el motor de conección
    try:
        with engine.connect() as connection: # Se crea la variable que contendrá la conexión
            print("\nConexión a Postgresql con SqlAlchemy exitosa.\n")
            result = connection.execute(sql) # Se ejecuta el script sql y la variable result contendrá el resultado
            if result.rowcount > 0:
                print("Registros afectados: ", result.rowcount,"\n")
                result = result.fetchall()
                df = pd.DataFrame(result)
                print(df)
            print("\nQuery ejecutada con éxito!!!\n") # Esto hará si la sentencia se ejecutó con éxito
    except Exception as e:
        print("Log: ", e)
    finally:
        if connection:
            connection.close()


"""
    Ejecutamos la función que declaramos arriba para ejecutar sentencias sql
"""
execute_file_sql("SELECT * FROM prueba.persona_psycopg2") # Consultamos la tabla
#execute_file_sql("CREATE TABLE prueba.persona_table (id serial primary key, nombre varchar)") # Consultamos la tabla