import requests, zipfile, io

url="http://account.geodir.co/resources/file/recursos/geodir-ubigeo-inei.zip"
save_path="./"

r = requests.get(url)
z = zipfile.ZipFile(io.BytesIO(r.content))
z.extractall(save_path)
