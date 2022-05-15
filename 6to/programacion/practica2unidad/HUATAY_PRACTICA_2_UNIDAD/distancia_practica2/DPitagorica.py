def Dpitagorica(x1,y1,x2,y2):
    x_dist = x1 - x2
    y_dist = y1 - y2
    dist_sq = x_dist**2 + y_dist**2
    distance = pow(dist_sq,1/2)
    return distance

resultado = Dpitagorica(456456.23,1279721.064,576628.34,1071740.33)
print(resultado)
