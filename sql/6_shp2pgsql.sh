#
#   shp2pgsql: Casos de uso según los exámenes
#   Autor: Luis Huatay
#   Mayo 2022
#

#
#   shp2pgsql es una herramienta que nos ayuda a importar archivos tipo shapefile
#   a base de datos postgresql, el motivo por el cual este archivo tien extensión sh
#   es porque esta no es una herramienta propia de psql si no que trabaja a nivel de
#   línea de comando, es decir, en terminal. Para ejecutar este archivo utilizar sh
#

#
#   Ejecución de la herramienta para subir los shapefiles que se encuentran en la carpeta
#   /sencico_anything/files/shapefiles/
#

# Sintaxis (para este caso en específico de solo subir el shape a la base de datos): 

shp2pgsql -s 4326 -I -d -g geom ../files/shapefiles/cuencas/UH.shp prueba.cuenca | psql -d tobi -U dbatobi -W
shp2pgsql -s 4326 -I -d -g geom ../files/shapefiles/dir_zonal/dz_gcs.shp prueba.dir_zonal | psql -d tobi -U dbatobi -W
shp2pgsql -s 4326 -I -d -g geom ../files/shapefiles/heladas/anual.shp prueba.helada | psql -d tobi -U dbatobi -W

#
#   -s      : define el sistema de referencia en epsg
#   -I      : crea el índice de geometría gist
#   -g      : define el nombre geometría
#   + info aquí: http://www.bostongis.com/pgsql2shp_shp2pgsql_quickguide_20.bqg
#

#
#   Se usa el pipe operator | para que la salida de la herramienta se vaya a postgres
#   se podría enviar el shapefile a un archivo sql cambiando esta salida a 
#   > nombredelarchivo.sql
#