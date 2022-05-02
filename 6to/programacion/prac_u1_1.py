cadena = "nowcastingclimatologico_20201028-0740_analisis_20201116-1930_web.shp";
print("\n Nombre: \t" + cadena + "\n");
print("Fecha y hora (izquierda):\t"+cadena[30:32]+"/"+cadena[28:30]+"/"+cadena[24:28]+"\t"+cadena[33:35]+":"+cadena[35:37]);
print("Nombre del producto:\t\t"+cadena[38:46]);
print("Fecha y hora (derecha):\t\t"+cadena[53:55]+"/"+cadena[51:53]+"/"+cadena[47:51]+"\t"+cadena[56:58]+":"+cadena[58:60]);
print("Nombre completo:\t\t"+cadena[0:64])
