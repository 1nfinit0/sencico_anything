# 2.	La desviación estándar es la medida de dispersión más común, que indica qué tan dispersos están los datos con respecto a la media. Mientras mayor sea la desviación estándar, mayor será la dispersión de los datos. A partir de los siguientes datos:
# data = [14,10,15,17,12,3,12,8,6,19,17,13,16,2,18,28,31,48,2,25,32]
# Determinar solo para las cifras pares, la desviación estándar.


data = [14,10,15,17,12,3,12,8,6,19,17,13,16,2,18,28,31,48,2,25,32]
pares = [num for num in data if num %2==0]
pares.sort()
print("Numeros pares: ",pares)
#cálculo de la media:
media = sum(pares)/len(pares)
#Cálculo de la Varianza
num = [x-media for x in pares]
num_2=[pow(y,2) for y in num]
varian=sum(num_2)/(len(pares)-1)
print("La varianza es: ", varian)
print("Nota: La varianza aplicada a datos de muestra y no población")