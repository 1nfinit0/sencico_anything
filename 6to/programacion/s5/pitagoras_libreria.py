from geopy.distance import great_circle

x1=-90.212452861859035
y1=32.316272202663704

x2=-88.952170968942525
y2=30.438559624660321

point_a = (y1,x1)
point_b = (y2,x2)

distance = great_circle(point_a, point_b).meters
print(distance)