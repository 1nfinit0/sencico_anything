/*
Copy: datos en csv a postgresql
Autor: Luis Huatay
Mayo 2022
*/

/*
    Copy es una herramienta dentro de psql que nos ayuda a subir información desde csv de manera automática
*/

-- Nos movemos a la base de datos tobi

\c tobi;

/*
    Para este caso se trabajará con un archivo csv llamado semap_esta
    Además se necesitará tener la tabla creada con anticipación:
*/

-- Creación de la tabla para el archivo csv

DROP TABLE IF EXISTS prueba.semap_esta_1;
CREATE TABLE prueba.semap_esta_1(
    v_cod_esta varchar primary key,
    V_COD_TIPO varchar,
    V_COD_ANESTA varchar,
	V_NOM_ESTA varchar,
    V_COD_CUEN varchar,
    V_COD_CATE varchar,
    V_COD_PROV varchar,
    V_COD_DEP varchar,
    V_COD_DIST varchar,
    V_COD_ENTI varchar,
    V_COD_DRE varchar,
    N_LON_GRAD float,
    N_LON_MIN float,
    N_LON_SEG float,
    N_LON_SIG float,
    N_LAT_GRAD float,
    N_ALT_MTS varchar,
    N_LAT_MIN float,
    N_LAT_SEG float,
    N_LAT_SIG float,
    V_COD_COND varchar,
    V_SUB_ESTA varchar,
    V_CLAS_ESTA varchar,
    V_COD_ZONA varchar,
    V_COD_CUENCA varchar,
    V_NOM_CUENCA varchar,
    V_COD_POSTAL varchar,
    N_MIN_HELADA float,
    N_MAX_HELADA float
);

/*
    prueba.semap_esta_1 es el nombre de la tabla
    delimiter define entre comillas la separación en el csv puedes ser: '|', ';'
    csv el formato en sí
    header define que el csv tiene en la primera fila los nombres de columnas y la omite, si no está pues... no la omite xd
*/

-- Copy

\copy prueba.semap_esta_1 FROM '../files/csv/SEMAP_ESTA.csv' DELIMITER ',' CSV HEADER;

/*
    Existen herramientas que nos puedes ayudar a trabajar de manera más eficaz con archivos
    csv, por ejemplo pgfutter, que hace que no sea necesario tener que crear la tabla con 
    antelación y especifica el tipo de dato de las columnas dependiendo el contenido ded estas
    sin embargo es una herramienta fuera de postgres y se instala disitinto dependiendo el
    sistema operativo. Más información aquí: https://github.com/lukasmartinelli/pgfutter
*/