-- UPADTE V_COD_DRE

ALTER TABLE esta.semap_esta
    ALTER COLUMN "V_COD_DRE" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "V_COD_DRE" = y.codigo
FROM esta.direccion_zonal y
    WHERE ST_Contains(y.geom, x.geom) = true
    
-- update N_Lon_grad

UPDATE esta.semap_esta x SET
    "N_LON_GRAD" = TRUNC("N_LON_SIG")
    
-- update N_Lon_MIN

UPDATE esta.semap_esta x SET
    "N_LON_MIN" = ABS(TRUNC(60*("N_LON_SIG" - TRUNC("N_LON_SIG"))))

-- update N_Lon_SEG
    UPDATE esta.semap_esta x SET
    "N_LON_SEG" = ABS(TRUNC(60*((60*("N_LON_SIG" - TRUNC("N_LON_SIG"))) - TRUNC((60*("N_LON_SIG" - TRUNC("N_LON_SIG")))))))

--------- update N_LAT_grad

UPDATE esta.semap_esta x SET
    "N_LAT_GRAD" = TRUNC("N_LAT_SIG")
    
-- update N_Lon_MIN

UPDATE esta.semap_esta x SET
    "N_LAT_MIN" = ABS(TRUNC(60*("N_LAT_SIG" - TRUNC("N_LAT_SIG"))))

-- update N_Lon_SEG
    UPDATE esta.semap_esta x SET
    "N_LAT_SEG" = ABS(TRUNC(60*((60*("N_LAT_SIG" - TRUNC("N_LAT_SIG"))) - TRUNC((60*("N_LAT_SIG" - TRUNC("N_LAT_SIG")))))))
    
    
-- Update V_cod_cuenca

ALTER TABLE esta.semap_esta
    ALTER COLUMN "V_COD_CUENCA" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "V_COD_CUENCA" = y.codigo
FROM esta.cuencas y
    WHERE ST_Contains(y.geom, x.geom) = true

-- Update V_nom_cuenca
ALTER TABLE esta.semap_esta
    ALTER COLUMN "V_NOM_CUENCA" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "V_NOM_CUENCA" = y.nombre
FROM esta.cuencas y
    WHERE ST_Contains(y.geom, x.geom) = true
    

-- Update V_cod_postal
ALTER TABLE esta.semap_esta
    ALTER COLUMN "V_COD_POSTAL" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "V_COD_POSTAL" = SUBSTRING(y.codigo_pos, 144, 5)
FROM esta.geodir_codigo_postal y
    WHERE ST_Contains(y.geom, x.geom) = true
    

-- Update N_MIN_HELADA

ALTER TABLE esta.semap_esta
    ALTER COLUMN "N_MIN_HELADA" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "N_MIN_HELADA" = y.minimo
FROM esta.heladas_anual y
    WHERE ST_Contains(y.geom, x.geom) = true
    

-- Update N_MAX_HELADA


ALTER TABLE esta.semap_esta
    ALTER COLUMN "N_MAX_HELADA" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "N_MAX_HELADA" = y.maximo
FROM esta.heladas_anual y
    WHERE ST_Contains(y.geom, x.geom) = true
-- Update V_cod_cuenca

ALTER TABLE esta.semap_esta
    ALTER COLUMN "V_COD_CUEN" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "V_COD_CUEN" = y.codigo
FROM esta.cuencas y
    WHERE ST_Contains(y.geom, x.geom) = true
    
    
-- Update V_cod_PROV

ALTER TABLE esta.semap_esta
    ALTER COLUMN "V_COD_PROV" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "V_COD_PROV" = SUBSTRING(y.ubigeo, 3, 2)
FROM esta.geodir_ubigeo_inei y
    WHERE ST_Contains(y.geom, x.geom) = true
    
-- Update V_cod_DEP

ALTER TABLE esta.semap_esta
    ALTER COLUMN "V_COD_DEP" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "V_COD_DEP" = SUBSTRING(y.ubigeo, 1, 2)
FROM esta.geodir_ubigeo_inei y
    WHERE ST_Contains(y.geom, x.geom) = true

---- Update V_cod_dist

ALTER TABLE esta.semap_esta
    ALTER COLUMN "V_COD_DIST" TYPE VARCHAR;
UPDATE esta.semap_esta x SET
    "V_COD_DIST" = SUBSTRING(y.ubigeo, 4, 2)
FROM esta.geodir_ubigeo_inei y
    WHERE ST_Contains(y.geom, x.geom) = true
    


