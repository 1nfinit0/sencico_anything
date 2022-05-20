import requests, zipfile, io

def descargar(url, save_path):
    r = requests.get(url)
    z = zipfile.ZipFile(io.BytesIO(r.content))
    z.extractall(save_path)
    return "Hecho!!"

urla = "http://account.geodir.co/resources/file/recursos/geodir-ubigeo-inei.zip"
urlb = "http://account.geodir.co/resources/file/recursos/geodir-codigo-postal-mtc.zip"
path = "/home/tobi/examenes/examen/shp/descargas"

print(descargar(urla,path))

print(descargar(urlb,path))