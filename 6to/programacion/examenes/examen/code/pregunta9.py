import psycopg2

# Función que devuelve los recursos de conección
def datosdeconexion_db():
    return['unid2', 'tobi', 'posttobi']

# Función que ejecuta el query
def update():
    url=datosdeconexion_db()
    conn=psycopg2.connect(database=url[0],user=url[1],password=url[2])
    prompt=conn.cursor()
    #V_COD_CUEN
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "V_COD_CUEN" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "V_COD_CUEN" = y.codigo FROM esta.cuencas y WHERE ST_Contains(y.geom, x.geom) = true')
    #V_COD_DEP
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "V_COD_PROV" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "V_COD_DEP" = SUBSTRING(y.ubigeo, 1, 2) FROM esta.geodir_ubigeo_inei y WHERE ST_Contains(y.geom, x.geom) = true')
    #V_COD_PROV
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "V_COD_DEP" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "V_COD_PROV" = SUBSTRING(y.ubigeo, 3, 2) FROM esta.geodir_ubigeo_inei y WHERE ST_Contains(y.geom, x.geom) = true')
    #V_COD_DIST
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "V_COD_DIST" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "V_COD_DIST" = SUBSTRING(y.ubigeo, 4, 2) FROM esta.geodir_ubigeo_inei y WHERE ST_Contains(y.geom, x.geom) = true')
    #V_COD_DRE
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "V_COD_DRE" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "V_COD_DRE" = y.codigo FROM esta.direccion_zonal y WHERE ST_Contains(y.geom, x.geom) = true')
    #N_LON_GRAD
    prompt.execute('UPDATE esta.semap_esta SET "N_LON_GRAD" = TRUNC("N_LON_SIG")')
    #N_LON_MIN
    prompt.execute('UPDATE esta.semap_esta x SET "N_LON_MIN" = ABS(TRUNC(60*("N_LON_SIG" - TRUNC("N_LON_SIG"))))')
    #N_LON_SEG
    prompt.execute('UPDATE esta.semap_esta x SET "N_LON_SEG" = ABS(TRUNC(60*((60*("N_LON_SIG" - TRUNC("N_LON_SIG"))) - TRUNC((60*("N_LON_SIG" - TRUNC("N_LON_SIG")))))))')
    #N_LAT_GRAD
    prompt.execute('UPDATE esta.semap_esta x SET "N_LAT_GRAD" = TRUNC("N_LAT_SIG")')
    #N_LAT_MIN
    prompt.execute('UPDATE esta.semap_esta x SET "N_LAT_MIN" = ABS(TRUNC(60*("N_LAT_SIG" - TRUNC("N_LAT_SIG"))))')
    #N_LAT_SEG
    prompt.execute('UPDATE esta.semap_esta x SET "N_LAT_SEG" = ABS(TRUNC(60*((60*("N_LAT_SIG" - TRUNC("N_LAT_SIG"))) - TRUNC((60*("N_LAT_SIG" - TRUNC("N_LAT_SIG")))))))')
    #V_COD_CUENCA
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "V_COD_CUENCA" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "V_COD_CUENCA" = y.codigo FROM esta.cuencas y WHERE ST_Contains(y.geom, x.geom) = true')
    #V_NOM_CUENCA
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "V_NOM_CUENCA" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "V_NOM_CUENCA" = y.nombre FROM esta.cuencas y WHERE ST_Contains(y.geom, x.geom) = true')
    #V_COD_POSTAL
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "V_COD_POSTAL" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "V_COD_POSTAL" = SUBSTRING(y.codigo_pos, 144, 5) FROM esta.geodir_codigo_postal y WHERE ST_Contains(y.geom, x.geom) = true')
    #N_MIN_HELADA
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "N_MIN_HELADA" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "N_MIN_HELADA" = y.minimo FROM esta.heladas_anual y WHERE ST_Contains(y.geom, x.geom) = true')
    #N_MAX_HELADA
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "N_MAX_HELADA" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "N_MAX_HELADA" = y.maximo FROM esta.heladas_anual y WHERE ST_Contains(y.geom, x.geom) = true')
    #V_COD_ZONA
    prompt.execute('ALTER TABLE esta.semap_esta ALTER COLUMN "V_COD_ZONA" TYPE VARCHAR')
    prompt.execute('UPDATE esta.semap_esta x SET "V_COD_ZONA" = TRUNC(((ST_X(geom)+180)/6)+1)')

    conn.commit()
    prompt.close()
    conn.close()
    return "Actualizado!!"

# Ejecución
print(update())