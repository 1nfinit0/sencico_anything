import psycopg2

connection = psycopg2.connect(database="lab3",user="tobi",password="tobispassword")
cursor = connection.cursor()
cursor.execute("CREATE EXTENSION postgis")
connection.commit()
