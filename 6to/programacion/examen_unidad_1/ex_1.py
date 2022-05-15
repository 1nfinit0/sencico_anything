# 	A partir de la siguiente cadena:
# nombre = "nowcastingclimatologico_20201028-0740_⋯_20201116-1930_web.shp"
# Los ⋯ indica que no sabemos los caracteres o el texto correspondiente.
# Escribir el script para mostrar
# 	La fecha hora (del lado derecho – color azul – formato: YYYYMMDD HHMM)

cadena="<a class='text-primary' href='https://maps.geodir.co/places/codpos384670/04000/-16.174076/-71.576868'><span class='geodir-icon-marker2'></span> 04000</a>"
rcadena=cadena[::-1]
print("Cadena: "+cadena)
print(rcadena[8:3:-1])


