"""
Fecha: Mayo 2022
Autor: Luis Huatay
Descripción: Conexión al gestor de base de datos PostgreSQL
"""

"""
    Existen varias formas de conectarse a una base de datos postgresql desde python, aquí
    veremos dos de ellas una con la librería psycopg2 y otra con la librería sqlalchemy.
    - psycopg2 es una librería de python que nos permite conectarnos a postgresql
    - sqlalchemy es una librería de python que nos permite conectarnos a cualquier otro gestor (revisar documentación)
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
    Conexión con psycopg2
"""
try: # Apartir de aquí se define la conexión (lo hacemos con try y except para si no funciona capturar el error)
    connection = psycopg2.connect(
        host=host,
        port=port,
        dbname=dbname,
        user=user,
        password=password
    )
    print("\nConexión con psycopg2 a Postgresql realizada con éxito\n") # Esto hará si la conexión es exitosa
except Exception as e: # Esto define el comportamiento si falla la conexión
    print("Error al conectar con PostgreSQL: ", e) # Esto hará si falla
finally: # Esto hará siempre porque tiene que cerrar la conexión o se generarán varias sesion en psql (revisar )
    if connection:
        connection.close()

"""
    Conexión con sqlalchemy
"""
try: # Apartir de aquí se define la conexión
    engine = create_engine(
        f"postgresql://{user}:{password}@{host}:{port}/{dbname}"
    )
    print("\nConexión con sqlalchemy a Postgresql realizada con éxito\n") # Esto hará si la conexión es exitosa
except Exception as e: # Esto define el comportamiento si falla la conexión
    print("Error al conectar con PostgreSQL: ", e) # Esto hará si falla
finally: # Esto hará siempre porque tiene que cerrar la conexión o se generarán varias sesion en psql (revisar )
    if connection:
        connection.close()

"""
    Tener en cuenta:
        - Para poder realizar la coneción es necesario tener instalado postgresql en el equipo
        - Tener el servicio activo en el equipo (sudo service postgresql start)
"""