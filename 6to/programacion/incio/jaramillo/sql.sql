-- Puntos
SELECT
	gid::integer as gid,
	nombre::varchar as nombre,
	epsg::varchar as EPSG,
	geom::Geometry(point,4326) as geom
INTO pruebas.puntos
	from(
    	values
	    (1,'Punto 1','4326',ST_SetSRID(ST_MakePoint(-76.286108,-13.929341),4326)),
    	(2,'punto 2','4326',ST_SetSRID(ST_MakePoint(-76.253010,-13.899182),4326)),
    	(3,'punto 3','4326',ST_SetSRID(ST_MakePoint(-76.259596,-13.881314),4326)),
    	(4,'punto 4','4326',ST_SetSRID(ST_MakePoint(-76.360746,-13.879675),4326)),
    	(5,'punto 5','4326',ST_SetSRID(ST_MakePoint(-76.266857,-13.871478),4326)),
    	(6,'punto 6','4326',ST_SetSRID(ST_MakePoint(-76.356524,-13.870658),4326)),
		(7,'Punto 1','4326',ST_SetSRID(ST_MakePoint(-76.342002,-13.868691),4326)),
    	(8,'punto 2','4326',ST_SetSRID(ST_MakePoint(-76.291174,-13.866232),4326)),
    	(9,'punto 3','4326',ST_SetSRID(ST_MakePoint(-76.330857,-13.864428),4326)),
    	(10,'punto 4','4326',ST_SetSRID(ST_MakePoint(-76.311100,-13.862953),4326))
	) as t(gid,nombre,epsg,geom);

ALTER TABLE pruebas.puntos ADD PRIMARY KEY (gid); 
create index puntos_ix on pruebas.puntos using gist(geom);

-- Líneas
SELECT
	gid::integer as gid,
	nombre::varchar as nombre,
	epsg::varchar as EPSG,
	geom::Geometry(LineString,4326) as geom
INTO pruebas.lineas
	from(
    	values
	    (1,'linea 1','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.253010,-13.899182)]),4326)),
		(2,'linea 2','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.259596,-13.881314)]),4326)),
		(3,'linea 3','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.360746,-13.879675)]),4326)),
		(4,'linea 4','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.266857,-13.871478)]),4326)),
		(5,'linea 5','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.356524,-13.870658)]),4326)),
		(6,'linea 6','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.342002,-13.868691)]),4326)),
		(7,'linea 7','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.291174,-13.866232)]),4326)),
		(8,'linea 8','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.330857,-13.864428)]),4326)),
		(9,'linea 9','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.311100,-13.862953)]),4326)),
		(10,'linea 10','4326',ST_SetSRID(ST_MakeLine(ARRAY[ST_MakePoint(-76.330857,-13.864428),ST_MakePoint(-76.311100,-13.862953)]),4326))
	) as t(gid,nombre,epsg,geom);

ALTER TABLE pruebas.lineas ADD PRIMARY KEY (gid); 
create index lineas_ix on pruebas.lineas using gist(geom);

-- Polígonos
SELECT
	gid::integer as gid,
	nombre::varchar as nombre,
	epsg::varchar as EPSG,
	geom::Geometry(Polygon,4326) as geom
INTO pruebas.poligonos
	from(
    	values
		(1,'poligono 1','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.253010,-13.899182),ST_MakePoint(-76.259596,-13.881314),ST_MakePoint(-76.286108,-13.929341)])),4326)),
		(2,'poligono 2','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.253010,-13.899182),ST_MakePoint(-76.259596,-13.881314),ST_MakePoint(-76.360746,-13.879675),ST_MakePoint(-76.253010,-13.899182)])),4326)),
		(3,'poligono 3','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.259596,-13.881314),ST_MakePoint(-76.360746,-13.879675),ST_MakePoint(-76.266857,-13.871478),ST_MakePoint(-76.259596,-13.881314)])),4326)),
		(4,'poligono 4','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.360746,-13.879675),ST_MakePoint(-76.266857,-13.871478),ST_MakePoint(-76.356524,-13.870658),ST_MakePoint(-76.360746,-13.879675)])),4326)),
		(5,'poligono 5','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.266857,-13.871478),ST_MakePoint(-76.356524,-13.870658),ST_MakePoint(-76.342002,-13.868691),ST_MakePoint(-76.266857,-13.871478)])),4326)),
		(6,'poligono 6','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.356524,-13.870658),ST_MakePoint(-76.342002,-13.868691),ST_MakePoint(-76.291174,-13.866232),ST_MakePoint(-76.356524,-13.870658)])),4326)),
		(7,'poligono 7','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.342002,-13.868691),ST_MakePoint(-76.291174,-13.866232),ST_MakePoint(-76.330857,-13.864428),ST_MakePoint(-76.342002,-13.868691)])),4326)),
		(8,'poligono 8','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.291174,-13.866232),ST_MakePoint(-76.330857,-13.864428),ST_MakePoint(-76.311100,-13.862953),ST_MakePoint(-76.291174,-13.866232)])),4326)),
		(9,'poligono 9','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.330857,-13.864428),ST_MakePoint(-76.311100,-13.862953),ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.330857,-13.864428)])),4326)),
		(10,'poligono 10','4326',ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[ST_MakePoint(-76.311100,-13.862953),ST_MakePoint(-76.286108,-13.929341),ST_MakePoint(-76.253010,-13.899182),ST_MakePoint(-76.311100,-13.862953)])),4326))
	) as t(gid,nombre,epsg,geom);

ALTER TABLE pruebas.poligonos ADD PRIMARY KEY (gid); 
create index poligonos_ix on pruebas.poligonos using gist(geom);
