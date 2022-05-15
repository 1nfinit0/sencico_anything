import math
xa=float(input("Ingrese Coordenada X1: "))
ya=float(input("Ingrese Coordenada Y1: "))
xb=float(input("Ingrese Coordenada X2: "))
yb=float(input("Ingrese Coordenada Y2: "))

angulo = math.atan2(yb-ya, xb-xa) * 180 / math.pi

if angulo<90:
    print("El rumbo es: N ",int(angulo),"° E")
if angulo>90 and angulo<180:
    print("El rumbo es: N ",90-int(angulo),"° O")
if angulo>180 and angulo<270:
    print("El rumbo es: S ",180-int(angulo)," O")
if angulo>270:
    print("El rumbo es: S ",270-int(angulo)," E")
else:
    print("Fin")