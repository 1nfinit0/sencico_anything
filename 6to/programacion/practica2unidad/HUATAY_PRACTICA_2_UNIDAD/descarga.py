import requests, zipfile, io

url = "http://account.geodir.co/resources/file/recursos/geodir-codigo-postal-mtc.zip"
save_path = "/mnt/d/tobisthings/sencico/progrmacion/shapes/"

r = requests.get(url)
z = zipfile.ZipFile(io.BytesIO(r.content))
z.extractall(save_path)