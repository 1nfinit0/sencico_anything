# 	A partir de la siguiente cadena:
# nombre = "nowcastingclimatologico_20201028-0740_⋯_20201116-1930_web.shp"
# Los ⋯ indica que no sabemos los caracteres o el texto correspondiente.
# Escribir el script para mostrar
# 	La fecha hora (del lado derecho – color azul – formato: YYYYMMDD HHMM)

cadena="nowcastingclimatologico_20201028-0740_⋯_20201116-1930_web.shp"
rcadena=cadena[::-1]
print("Cadena: "+cadena)
print("Fecha y hora:\t"+rcadena[14:12:-1]+"/"+rcadena[16:14:-1]+"/"+rcadena[20:16:-1]+"\t"+rcadena[11:9:-1]+":"+rcadena[9:7:-1])
