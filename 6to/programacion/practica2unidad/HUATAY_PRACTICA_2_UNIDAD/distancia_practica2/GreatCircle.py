from geopy.distance import great_circle

def Gcircle(x1,y1,x2,y2):
     a = (y1,x1)
     b = (y2,x2)
     distancia = great_circle(a, b).meters
     return distancia