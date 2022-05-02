	# Programar el cálculo de x^(x^(x^(1+√x) )+√(x^x+1)+1/2 x)  para x=π
import math
x=math.pi
#resultado=pow(x,(pow(x,pow(x,1+pow(x,1/2))))+(pow(pow(x,x)+1,1/2)+1/2(x)))
print("El tipo de error en el output describe que es un número demasiado grande")
tree=pow(x,(pow(x,pow(x,1+pow(x,1/2)))+(pow(pow(x,x)+1,1/2))+x/2))
print(tree)