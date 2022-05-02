"""
    En la siguiente cadena de texto:
        shp_202105270334_analisis_202105270658.shp

    Imprimir en pantalla:
        Entrada:
            fecha:  DD/MM/YYYY
            hora:   HH:MM:SS

        Salida:
            fecha: DD/MM/YYYY
            hora:   HH:MM:SS
"""
cadena = "shp_202105270334_analisis_202105270658.shp";

print("\n Cadena: \t" + cadena + "\n");
print("* Entrada: \n \t fecha: " + cadena[10:12] + "/" + cadena[8:10] + "/" + cadena[4:8]);
print("\t hora: \t" + cadena[12:14] + ":" + cadena[14:16] + ":00");
print("* Salida: \n \t fecha: " + cadena[32:34] + "/" + cadena[30:32] + "/" + cadena[26:30]);
print("\t hora: \t" + cadena[34:36] + ":" + cadena[36:38] + ":00");



