"""
Geopy puede calcular la distancia geodésica entre dos puntos utilizando la distancia geodésica o la distancia del círculo máximo,
con un valor predeterminado de la distancia geodésica disponible como función geopy.distance.distance.

La distancia de círculo máximo (great_circle) utiliza un modelo esférico de la Tierra,
utilizando el radio medio terrestre definido por la Unión Internacional de Geodesia y Geofísica, (2a+b)/3=6371.0087714150598 kilómetros aproximadamente 6371.009 km (para WGS-84),
lo que da como resultado un error de hasta aproximadamente un 0,5%.
El valor del radio se almacena en distance.EARTH_RADIUS, por lo que se puede personalizar (sin embargo, siempre debe estar en kilómetros).

Existen varios modelos elipsoidales populares, y cuál será el más preciso depende de dónde estén ubicados sus puntos en la tierra. El valor predeterminado es el elipsoide WGS-84, 
que es el más preciso a nivel mundial. geopy incluye algunos otros modelos en el distance.ELLIPSOIDS
diccionario:

              model             major (km)   minor (km)     flattening
ELLIPSOIDS = {'WGS-84':        (6378.137,    6356.7523142,  1 / 298.257223563),
              'GRS-80':        (6378.137,    6356.7523141,  1 / 298.257222101),
              'Airy (1830)':   (6377.563396, 6356.256909,   1 / 299.3249646),
              'Intl 1924':     (6378.388,    6356.911946,   1 / 297.0),
              'Clarke (1880)': (6378.249145, 6356.51486955, 1 / 293.465),
              'GRS-67':        (6378.1600,   6356.774719,   1 / 298.25),
              }
"""

from geopy.distance import geodesic

x1 = -90.212452861859035
y1 = 32.316272202663704

x2 = -88.952170968942525
y2 = 30.438559624660321

point_a = (y1,x1)
point_b = (y2,x2)

#distance = geodesic(point_a, point_b).miles
distance = geodesic(point_a, point_b, ellipsoid='WGS-84').meters
print(distance)
