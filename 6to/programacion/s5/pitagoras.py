import math
#Primer punto
x1 = 456456.23
y1 = 1279721.064
#Segundo punto
x2 = 576628.34
y2 = 1071740.33
#Distancia entre X
x_dist = x1 - x2
#Distancia Y
y_dist = y1 - y2
#Teorema de pitágoras
dist_sq = x_dist**2 + y_dist**2
distance = pow(dist_sq,1/2)
print(distance)