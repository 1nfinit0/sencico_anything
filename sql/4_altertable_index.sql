/*
Alter Tables y la creación de índices espaciales
Autor: Luis Huatay
Mayo 2022
*/

/*
    Alter table es una sentencia que usamos para la actualización de cualquier propiedad de una tabla,
    desde columnas, datos, tipos de tabla, extensiones, etc.
    Con respecto al la creación de indexes estos nos ayudar a manejar columnas de geometrías de manera
    más eficaz al generar para estos una especide de índice que ayuda a al proceso de muestra de resultados
    en un select o a los procesos geográficos que queramos.
    + info aquí: http://postgis.net/workshops/postgis-intro/indexing.html
*/

-- Nos movemos a la base de datos tobi

\c tobi;

-- Alter table para las tablas creadas de manera dinámica, les falta primary key

ALTER TABLE prueba.punto_dinamico ADD PRIMARY KEY(gid);
ALTER TABLE prueba.linea_dinamico ADD PRIMARY KEY(gid);
ALTER TABLE prueba.poligono_dinamico ADD PRIMARY KEY(gid);

-- Creación de los índices para todas las tablas

CREATE INDEX prueba_punto_idx ON prueba.punto USING GIST(geom);
CREATE INDEX prueba_linea_idx ON prueba.linea USING GIST(geom);
CREATE INDEX prueba_poligono_idx ON prueba.poligono USING GIST(geom);
CREATE INDEX prueba_punto_dinamico_idx ON prueba.punto_dinamico USING GIST(geom);
CREATE INDEX prueba_linea_dinamico_idx ON prueba.linea_dinamico USING GIST(geom);
CREATE INDEX prueba_poligono_dinamico_idx ON prueba.poligono_dinamico USING GIST(geom);