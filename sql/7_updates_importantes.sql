/*
UPDATE: Casos de uso según los exámenes
Autor: Luis Huatay
Mayo 2022
*/

/*
    A lo largo de mi experiencia en postgresql fue necesario contar con sentencias update
    que parecen ser específicas para un tipo de problema, pero que después no lo son tanto
    y son requeridos en otros procesos. Aquí algunos de esos
*/

-- Nos movemos a la base de datos tobi

\c tobi;

/*
    En el script anterior vimos como subir un csv usando copy, sin embargo, si apreciamos bien
    a la tabla prueba.semap_esta_1 en distintos campos les hace faklta información, algunos de
    ellos serán llenados con estas sentencias y otros los dejaremos vacíos para ser llenados
    luego pero con uso de lenguaje python ya que serán necesarios crear otras tablas con
    diferente información como shapefiles o inclusive xml que estén en internet.
*/

/*
    ST_Contains() es una función que viene por parte de las implementación de la extensión postgis
    lo que hace es devolver un valor booleano true o false según el resultado de su función que
    lo que hace es afirmar si una geometría está dentro de otra o no.
*/

/*
    Antes de poder seguir con la actualización de tablas necesitamo crear el campo de geometría
    de la tabla semap_esta_1 ya que si bien tiene corrdenadas x,y no se encuentran como geometría
    en una columna geom. Para ello lo siguiente:
*/

-- Agregando columna de geometría:

ALTER TABLE prueba.semap_esta_1 DROP COLUMN IF EXISTS geom;
ALTER TABLE prueba.semap_esta_1 ADD COLUMN geom Geometry(Point,4326);
CREATE INDEX geom_idx ON prueba.semap_esta_1 USING GIST(geom);

-- Agregando geometría de acuerdo a los campos n_lon_sig, n_lat_sig

UPDATE prueba.semap_esta_1 SET
    geom = ST_SetSRID(ST_MakePoint(n_lon_sig,n_lat_sig),4326);



-- Update para el campo v_cod_cuen (ST_Contains)
UPDATE prueba.semap_esta_1 x SET
    v_cod_cuen = z.codigo
    FROM prueba.cuenca z
    WHERE ST_Contains(z.geom,x.geom) = true;

-- Update para el campo v_cod_dre (ST_Contains)
UPDATE prueba.semap_esta_1 x SET
    v_cod_dre = z.codigo
    FROM prueba.dir_zonal z
    WHERE ST_Contains(z.geom,x.geom) = true;

-- Update para el campo n_lon_grad (grados de la coordenada x)
UPDATE prueba.semap_esta_1 SET
    n_lon_grad = TRUNC(n_lon_sig);

-- Update para el campo n_lon_min (minutos de la coordenada x)
UPDATE prueba.semap_esta_1 SET
    n_lon_min = ABS(TRUNC(60*(n_lon_sig - TRUNC(n_lon_sig))));

-- Update para el campo n_lon_min (segundos de la coordenada x)
UPDATE prueba.semap_esta_1 SET
    n_lon_seg = ROUND((60*(60*(n_lon_sig - TRUNC(n_lon_sig)) - TRUNC(60*(n_lon_sig - TRUNC(n_lon_sig)))))::numeric,3);

-- Update para el campo n_lat_grad (grados de la coordenada y)
UPDATE prueba.semap_esta_1 SET
    n_lat_grad = TRUNC(n_lat_sig);

-- Update para el campo n_lat_min (minutos de la coordenada y)
UPDATE prueba.semap_esta_1 SET
    n_lat_min = ABS(TRUNC(60*(n_lat_sig - TRUNC(n_lat_sig))));

-- Update para el campo n_lat_min (segundos de la coordenada y)
UPDATE prueba.semap_esta_1 SET
    n_lat_seg = ROUND((60*(60*(n_lat_sig - TRUNC(n_lat_sig)) - TRUNC(60*(n_lat_sig - TRUNC(n_lat_sig)))))::numeric,3);

-- Update para el campo v_cod_zona (zona geográfica 17,18,19)
UPDATE prueba.semap_esta_1 SET
    v_cod_zona = TRUNC((((ST_X(geom)+180)/6)+1));

-- Update para el campo v_cod_cuenca
UPDATE prueba.semap_esta_1 x SET
    v_cod_cuenca = z.codigo
    FROM prueba.cuenca z
    WHERE ST_Contains(z.geom,x.geom) = true;

-- Update para el campo v_nom_cuenca
UPDATE prueba.semap_esta_1 x SET
    v_nom_cuenca = z.nombre
    FROM prueba.cuenca z
    WHERE ST_Contains(z.geom,x.geom) = true;

-- Update para el campo n_min_helada
UPDATE prueba.semap_esta_1 x SET
    n_min_helada = z.minimo
    FROM prueba.helada z
    WHERE ST_Contains(z.geom,x.geom) = true;

-- Update para el campo n_max_helada
UPDATE prueba.semap_esta_1 x SET
    n_max_helada = z.maximo
    FROM prueba.helada z
    WHERE ST_Contains(z.geom,x.geom) = true;