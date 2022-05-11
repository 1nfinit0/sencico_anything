#Según el profesor pasa ejecutar la operación de lectura del archvivo online necesitaremos estas 3 libreriías:

from email import header
import psycopg2
import requests
import pandas

def resources_db():
    return ['demo','postgres','postgres']

def url_reservorios():
    return f'http://phisis.senamhi.gob.pe:8765/ms-reservorio/msreservorio/reservorio/lista/idesep'

def departamento(longitud, latitud):
    db = resources_db()
    connection = psycopg2.connect(database=db[0], user=db[1], password=db[2])
    cursor = connection.cursor()
    cursor.execute("SELECT x.departamen FROM dbcarto_fundamento.departamentos x, (SELECT ST_SetSRID(ST_MakePoint(%s,%s), 4326) AS geom) y WHERE ST_Contains(x.geometry, y.geom)",(longitud, latitud))
    rs = cursor.fetchall()
    for row in rs:
        ubigeo = row[0]
    connection.commit()
    cursor.close()
    connection.close()
    return ubigeo

def provincia(longitud, latitud):
    db = resources_db()
    connection = psycopg2.connect(database=db[0], user=db[1], password=db[2])
    cursor = connection.cursor()
    cursor.execute("SELECT x.provincia FROM dbcarto_fundamento.provincias x, (SELECT ST_SetSRID(ST_MakePoint(%s,%s), 4326) AS geom) y WHERE ST_Contains(x.geometry, y.geom)",(longitud, latitud))
    rs = cursor.fetchall()
    for row in rs:
        ubigeo = row[0]
    connection.commit()
    cursor.close()
    connection.close()
    return ubigeo

def distrito(longitud, latitud):
    db = resources_db()
    connection = psycopg2.connect(database=db[0], user=db[1], password=db[2])
    cursor = connection.cursor()
    cursor.execute("SELECT x.distrito FROM dbcarto_fundamento.distritos x, (SELECT ST_SetSRID(ST_MakePoint(%s,%s), 4326) AS geom) y WHERE ST_Contains(x.geometry, y.geom)",(longitud, latitud))
    rs = cursor.fetchall()
    for row in rs:
        ubigeo = row[0]
    connection.commit()
    cursor.close()
    connection.close()
    return ubigeo

def cuenca(longitud, latitud):
    db = resources_db()
    connection = psycopg2.connect(database=db[0], user=db[1], password=db[2])
    cursor = connection.cursor()
    cursor.execute("SELECT x.codigo, x.nomb_uh_n1, x.nombre FROM dbcarto_fundamento.cuencas x, (SELECT ST_SetSRID(ST_MakePoint(%s,%s), 4326) AS geom) y WHERE ST_Contains(x.geometry, y.geom)",(longitud, latitud))
    rs = cursor.fetchall()
    for row in rs:
        codigo = row[0]
        unidad_hidro = row[1]
        nombre = row[2]
    connection.commit()
    cursor.close()
    connection.close()
    return [codigo, unidad_hidro, nombre]

def delete_data():
    db = resources_db()
    connection = psycopg2.connect(database=db[0],user=db[1],password=db[2])
    cursor = connection.cursor()
    cursor.execute("DELETE FROM dbcarto_fundamento.reservorios")
    connection.commit()
    cursor.close()
    connection.close()

delete_data()

db = resources_db()
connection = psycopg2.connect(database=db[0],user=db[1],password=db[2])
cursor = connection.cursor()

df = pandas.read_json(url_reservorios(),dtype=False,encoding='utf-8')
for i, row in df.iterrows():
    cod_reservorio = row['codReservorio']
    nom_reservorio = row['nomReservorio']
    nom_sector = row['nomSector']
    longitud = row['longitud']
    latitud = row['latitud']
    fecha = row['fecha']
    porcentaje = row['porcentaje']
    nom_departamento = departamento(longitud, latitud)
    nom_provincia = provincia(longitud, latitud)
    nom_distrito = distrito(longitud, latitud)
    cuencas = cuenca(longitud, latitud)
    cod_cuenca = cuencas[0]
    nom_und_hidro = cuencas[1]
    nom_cuenca = cuencas[2]
    print(
        cod_reservorio,
        nom_reservorio,
        nom_sector,
        longitud,
        latitud,
        fecha,
        porcentaje,
        nom_departamento,
        nom_provincia,
        nom_distrito,
        cuencas[0],
        cuencas[1],
        cuencas[2]
        )

    cursor.execute("INSERT INTO dbcarto_fundamento.reservorios(cod_reservorio, nom_reservorio, nom_sector, longitud, latitud, fecha, porcentaje, nom_departamento, nom_provincia, nom_distrito, cod_cuenca, nom_cuenca, nom_und_hidro, geom) VALUES (%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,ST_SetSRID(ST_MakePoint(%s,%s), 4326))", (cod_reservorio, nom_reservorio, nom_sector, longitud, latitud, fecha, porcentaje, nom_departamento, nom_provincia, nom_distrito, cod_cuenca, nom_cuenca, nom_und_hidro, longitud, latitud))

connection.commit()
cursor.close()
connection.close()

