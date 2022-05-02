data=[14,10,5,17,11,3,12,8,6,19,17,13,16,2,18]
pares = [num for num in data if num %2==0]
print("Numeros pares: ",pares)
pares.sort()
#Media
media = sum(pares)/len(pares)
#Mediana
medsub1 = (len(pares)+1)/2
listamediana=[pares[int(medsub1 - 0.5)-1],pares[int(medsub1 + 0.5)-1]]
mediana=sum(listamediana)/2
#Media Armónica
rec = [1/i for i in pares]
marmonia=len(pares)/sum(rec)
#Media Geométrica
prod=pow(pares[0]*pares[1]*pares[2]*pares[3]*pares[4]*pares[5]*pares[6]*pares[7],1/len(pares))

print("\nMedia:\t\t\t",media)
print("Mediana:\t\t",int(mediana))
print("Media Armónica:\t\t",marmonia);
print("Media Geométrica:\t",prod);

