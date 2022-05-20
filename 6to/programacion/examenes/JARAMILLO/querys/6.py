import requests, zipfile, io

url = "http://account.geodir.co/resources/file/recursos/geodir-ubigeo-inei.zip"
url2 = "http://account.geodir.co/resources/file/recursos/geodir-codigo-postal-mtc.zip"
save_path = "C:\examen\shp\download"

r = requests.get(url)
r2 = requests.get(url2)

z = zipfile.ZipFile(io.BytesIO(r.content))
z2 = zipfile.ZipFile(io.BytesIO(r2.content))

z.extractall(save_path)
z2.extractall(save_path)