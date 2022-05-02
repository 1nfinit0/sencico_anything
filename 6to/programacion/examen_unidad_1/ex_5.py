# 5.	Escribir un programa para resolver el triángulo mostrado (solo para cada caso mostrado en la imagen). El programa deberá validar la existencia del triángulo antes de proceder a resolver.
import math

from torch import trunc
#Función que valida la existencia de un triángulo
print("\n\t\t\tBienvenido al programa que sabe todo acerca de los triángulos 😄\n")
print("Primero definiremos el triángulo\n\t(NOTA: Se asumirá que las unidades son metros)\n")
a=float(input("Introduzca lado a: "))
b=float(input("Introduzca lado b: "))
c=float(input("Introduzca lado c: "))
if a<(b+c) and b<(a+c) and c<(a+b) :
    #área
    semip=(a+b+c)/2
    area=pow(semip*(semip-a)*(semip-b)*(semip-c),1/2)
    print("\nÁrea del triángulo: "+str(round(area,2))+"m2")
    #perímetro
    perimetro=a+b+c
    print("\nPerímetro del triángulo: "+str(round(perimetro,2))+"m")
    #Ángulo a
    alfa=math.acos((pow(a,2)+pow(b,2)-pow(c,2))/(2*b*c))
    deg=math.degrees(alfa)
    entera=math.trunc(deg)
    minuto=(deg-entera)*60
    eminuto=math.trunc(minuto)
    segundo=(minuto-eminuto)*60
    esegundo=math.trunc(segundo)
    print("\nÁngulo alfa del triángulo: "+str(entera)+"°"+str(eminuto)+"'"+str(esegundo)+"''")
    #Ángulo b
    beta=math.acos((pow(b,2)+pow(c,2)-pow(a,2))/(2*b*c))
    betadeg=math.degrees(beta)
    betaentera=math.trunc(betadeg)
    betaminuto=(betadeg-betaentera)*60
    betaeminuto=math.trunc(betaminuto)
    betasegundo=(betaminuto-betaeminuto)*60
    betaesegundo=math.trunc(betasegundo)
    print("\nÁngulo beta del triángulo: "+str(betaentera)+"°"+str(betaeminuto)+"'"+str(betaesegundo)+"''")
    #Ángulo y
    gamma=math.acos((pow(a,2)+pow(c,2)-pow(b,2))/(2*a*c))
    gamdeg=math.degrees(gamma)
    gamentera=math.trunc(gamdeg)
    gamminuto=(gamdeg-gamentera)*60
    egamminuto=math.trunc(gamminuto)
    gamsegundo=(gamminuto-egamminuto)*60
    egamsegundo=math.trunc(gamsegundo)
    print("\nÁngulo gamma del triángulo: "+str(gamentera)+"°"+str(egamminuto)+"'"+str(egamsegundo)+"''")
    #Áltura
    altura=2*(area)/(a)
    print("\nÁltura del triángulo: "+str(round(altura,2))+"m")
    #Bisectriz
    bisec=2*((pow(semip*(semip-a)*(semip-b)*(semip-c),1/2))/(a+b))
    print("\nBisectriz del triángulo: "+str(round(bisec,2))+"m")
    #Mediana
    mediana=(pow((2*pow(a,2))+(2*pow(c,2))-(pow(b,2)),1/2))/(2)
    print("\nMediana del triángulo: "+str(round(mediana,2))+"m")

else:
    print("\nEl triángulo no existe :(")