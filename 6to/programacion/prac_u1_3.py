xa=float(input("Ingrese coordenada X del punto 1: "))
ya=float(input("Ingrese coordenada Y del punto 1: "))
xb=float(input("Ingrese coordenada X del punto 2: "))
yb=float(input("Ingrese coordenada Y del punto 2: "))
dif1=xb-xa
dif2=yb-ya
radical=pow(dif1,2)+pow(dif2,2)
distancia=pow(radical,1/2)


print("La distancia pitagórica es: ",distancia)
