from geopy.distance import great_circle
import math

def distancia_pitagoras(x1,y1,x2,y2):
    x_dist = x1 - x2
    y_dist = y1 - y2
    dist_sq = x_dist**2 + y_dist**2
    distance = math.sqrt(dist_sq)
    return distance

def pitagoras_lib(x1,y1,x2,y2):
     a = (y1,x1)
     b = (y2,x2)
     distance = great_circle(a, b).meters
     return distance

def heavercine(x1,y1,x2,y2):
    RADIO_TERRESTRE = 6371251.46
    x_dist=math.radians(x1-x2)
    y_dist=math.radians(y1-y2)
    y1_rad=math.radians(y1)
    y2_rad=math.radians(y2)
    a = math.sin(y_dist/2)**2+math.sin(x_dist/2)**2*math.cos(y1_rad)*math.cos(y2_rad)
    c = 2*math.asin(math.sqrt(a))
    distance = c * RADIO_TERRESTRE
    return distance

def vincenty(x1,y1,x2,y2):
    distance = None
    # Parametros del Elipsoide (segun documentacion IGN-Peru)
    a = 6378137  # semi-eje-mayor
    f = 1/298.257222101 # achatamiento
    b = abs((f*a)-a)    # semi-eje-menor
    L = math.radians(x2-x1)
    U1 = math.atan((1-f) * math.tan(math.radians(y1)))
    U2 = math.atan((1-f) * math.tan(math.radians(y2)))
    sinU1 = math.sin(U1)
    cosU1 = math.cos(U1)
    sinU2 = math.sin(U2)
    cosU2 = math.cos(U2)
    lam = L
    for i in range(100):
        sinLam = math.sin(lam)
        cosLam = math.cos(lam)
        sinSigma = math.sqrt((cosU2*sinLam)**2 + (cosU1*sinU2-sinU1*cosU2*cosLam)**2)
        if (sinSigma == 0):
            distance = 0  # puntos coincidentes
            break
        cosSigma = sinU1*sinU2 + cosU1*cosU2*cosLam
        sigma = math.atan2(sinSigma, cosSigma)
        sinAlpha = cosU1 * cosU2 * sinLam / sinSigma
        cosSqAlpha = 1 - sinAlpha**2
        cos2SigmaM = cosSigma - 2*sinU1*sinU2/cosSqAlpha
        if math.isnan(cos2SigmaM):
            cos2SigmaM = 0  # linea Ecuatorial
        C = f/16*cosSqAlpha*(4+f*(4-3*cosSqAlpha))
        LP = lam
        lam = L + (1-C) * f * sinAlpha * (sigma + C*sinSigma*(cos2SigmaM+C*cosSigma *(-1+2*cos2SigmaM*cos2SigmaM)))
        if not abs(lam-LP) > 1e-12:
            break
    uSq = cosSqAlpha * (a**2 - b**2) / b**2
    A = 1 + uSq/16384*(4096+uSq*(-768+uSq*(320-175*uSq)))
    B = uSq/1024 * (256+uSq*(-128+uSq*(74-47*uSq)))
    deltaSigma = B*sinSigma*(cos2SigmaM+B/4 * (cosSigma*(-1+2*cos2SigmaM*cos2SigmaM) - B/6*cos2SigmaM*(-3+4*sinSigma*sinSigma) * (-3+4*cos2SigmaM*cos2SigmaM)))
    s = b*A*(sigma-deltaSigma) 
    distance = s
    return distance


# Error
from sklearn.metrics import mean_absolute_error

pitagorica = distancia_pitagoras(456456.23,1279721.064,576628.34,1071740.33)
grancirculo = pitagoras_lib(-90.212452861859035,32.316272202663704,-88.952170968942525,30.438559624660321)
haversine = heavercine(-90.212452861859035,32.316272202663704,-88.952170968942525,30.438559624660321)
vincenty = vincenty(-90.212452861859035,32.316272202663704,-88.952170968942525,30.438559624660321)

promedio = (pitagorica + grancirculo + haversine + vincenty)/4
pitagorico = abs(promedio - pitagorica)
pitagorico_libreria = abs(promedio - grancirculo)
heversine = abs(promedio - haversine)
vincenty = abs(promedio - vincenty)

resultados = [pitagorico, pitagoras_lib, heversine, vincenty]

print(mean_absolute_error(promedio,resultados))