/*
Uso básico de crud
Autor: Luis Huatay
Mayo 2022
*/

/*
Para este y los siguientes querys se tendrá en cuenta que ya esta creada la base de datos 'tobi' con
    DROP DATABASE IF EXISTS tobi;
    CREATE DATABASE tobi;
Con el esquema que usaremos para este entorno con:
    CREATE SCHEMA prueba;
Y la extensión para la geometría:
    CREATE EXTENSION postgis;
*/

-- Para moverse a esa base de datos:

\c tobi;

-- Creación de la tabla que contendrá la geometría (puntos)

DROP TABLE IF EXISTS prueba.punto; -- misma sintáxis para borrar tablas
CREATE TABLE prueba.punto (
    gid serial primary key, -- serial hace el valor autoincremental
    nombre varchar,
    geom Geometry(Point,4326)
);

-- Insertamos información de manera manual

INSERT INTO prueba.punto (nombre,geom) VALUES -- No definimos la columna gid por ser autoincremental
('Punto', ST_SetSRID(ST_MakePoint(-77.15104755984243923,-12.06241976104948854),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.15043303693384757,-12.06219860968047541),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.15013192070863113,-12.06240654004886004),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14905896371021754,-12.06172385476676645),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14911427077201722,-12.0613740980773958),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14866566904872514,-12.06091015894702068),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14837438519003854,-12.06128876218360624),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14846164744307089,-12.06154236595740592),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14812365984332132,-12.06181399816946076),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14805852041502021,-12.0618644784617377),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14771684567783439,-12.06213130270587186),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14748086888094747,-12.06200750590490145),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14702120574530397,-12.06226591663818226),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14735919334503933,-12.06265293131709448),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14767137098260719,-12.06261086453122999),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14825148060829463,-12.06355556276067986),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14806589468990694,-12.06380195297294478),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14818634117999352,-12.06424184908154018),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14862142339927686,-12.06415771600184428),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14878242840133282,-12.06389930709196356),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14989348582008688,-12.06403151633278981),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.14997460284403985,-12.06431516502946444),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.15049817636214868,-12.06449665196184107),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.15051538300359368,-12.06394137367566266),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.15030767426048897,-12.06377791491342677),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.15056331579044979,-12.06287288040428685),4326)),
('Punto', ST_SetSRID(ST_MakePoint(-77.15081527018297436,-12.06283201556020757),4326));

-- Creación de la tabla que contendrá la geometría (líneas)

DROP TABLE IF EXISTS prueba.linea; -- misma sintáxis para borrar tablas
CREATE TABLE prueba.linea (
    gid serial primary key, -- serial hace el valor autoincremental
    nombre varchar,
    geom Geometry(LineString,4326)
);

-- Insetamos información de manera manual

INSERT INTO prueba.linea (nombre,geom) VALUES
('Avenida Agustín Gamarra', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.14868366718292,-12.059754609097208),
    ST_MakePoint(-77.15116202831268,-12.061847765534615),
    ST_MakePoint(-77.15124785900116,-12.061973669160274),
    ST_MakePoint(-77.1512907743454,-12.062304165896322),
    ST_MakePoint(-77.15115129947662,-12.06341631065098),
    ST_MakePoint(-77.1511834859848,-12.063589427108209),
    ST_MakePoint(-77.15131223201752,-12.063804511035716),
    ST_MakePoint(-77.15180039405823,-12.064019594790672),
    ST_MakePoint(-77.1512907743454,-12.062304165896322),
    ST_MakePoint(-77.15441823005676,-12.065126486507634)]),4326)),
('Calle Ucayali', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.15478837490082,-12.06620320972828),
    ST_MakePoint(-77.15470924973488,-12.066209767103706),
    ST_MakePoint(-77.15062290430069,-12.064579598635772)]),4326)),
('Calle Daniel Nieto', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.14860320091248,-12.059801823332293),
    ST_MakePoint(-77.14803993701935,-12.060887748445083),
    ST_MakePoint(-77.14793264865875,-12.061144802538239),
    ST_MakePoint(-77.14772343635559,-12.061407102379286),
    ST_MakePoint(-77.14740693569183,-12.061606450086872),
    ST_MakePoint(-77.14708507061005,-12.061664155974569)]),4326)),
('Calle Paz Soldán', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.14701533317566,-12.061611696077188),
    ST_MakePoint(-77.14659422636032,-12.064486483323403),
    ST_MakePoint(-77.1465727686882,-12.064683205776296),
    ST_MakePoint(-77.1463394165039,-12.066679274767202)]),4326)),
('Avenida Miguel Grau', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.15468108654022,-12.066474684936727),
    ST_MakePoint(-77.15141415596008,-12.065771734072715),
    ST_MakePoint(-77.14528799057007,-12.064161235217988)]),4326)),
('Calle Chanchamayo', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.1536511182785,-12.06622025890405),
    ST_MakePoint(-77.1542090177536,-12.064153366307316),
    ST_MakePoint(-77.1542090177536,-12.064082546100929)]),4326)),
('Calle Titicaca', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.15341776609421,-12.063458278287246),
    ST_MakePoint(-77.15303421020508,-12.063904184016785),
    ST_MakePoint(-77.15309321880339,-12.06398025021425),
    ST_MakePoint(-77.15310394763947,-12.064090415013688),
    ST_MakePoint(-77.15297520160675,-12.064612385709891),
    ST_MakePoint(-77.15261310338974,-12.065997308058309)]),4326)),
('Calle EE.UU', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.1523529291153,-12.062626793269512),
    ST_MakePoint(-77.15156435966492,-12.065774357027117)]),4326)),
('Calle Fanning', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.15149194002151,-12.063967135354165),
    ST_MakePoint(-77.1506416797638,-12.065564520593067)]),4326)),
('Calle Pichincha', ST_SetSRID(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.14804798364639,-12.064334351194189),
    ST_MakePoint(-77.1478870511055,-12.064837960671113)]),4326));

-- Creación de la tabla que contendrá la geometría (polígonos)

DROP TABLE IF EXISTS prueba.poligono; -- misma sintáxis para borrar tablas
CREATE TABLE prueba.poligono (
    gid serial primary key, -- serial hace el valor autoincremental
    nombre varchar,
    geom Geometry(Polygon,4326)
);

-- Insetamos información de manera manual

INSERT INTO prueba.poligono (nombre,geom) VALUES
('Fortaleza Real Felipe', ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.1504271030426,-12.064389433526806),
    ST_MakePoint(-77.15003818273544,-12.064247793220058),
    ST_MakePoint(-77.14996039867401,-12.06395402049342),
    ST_MakePoint(-77.14873731136322,-12.0638202488773),
    ST_MakePoint(-77.14852809906006,-12.064103529867742),
    ST_MakePoint(-77.14824110269547,-12.064116644721159),
    ST_MakePoint(-77.14817941188812,-12.063804511035716),
    ST_MakePoint(-77.14833498001099,-12.063565820325165),
    ST_MakePoint(-77.14772075414658,-12.062529742799704),
    ST_MakePoint(-77.14762151241302,-12.062522529587708),
    ST_MakePoint(-77.14739419519901,-12.062560562885135),
    ST_MakePoint(-77.14735731482506,-12.062546792209103),
    ST_MakePoint(-77.14714676141739,-12.062323838308238),
    ST_MakePoint(-77.14713871479034,-12.062277280264368),
    ST_MakePoint(-77.14717023074627,-12.06224711589359),
    ST_MakePoint(-77.14747264981268,-12.062109408940447),
    ST_MakePoint(-77.14773952960968,-12.062166458972465),
    ST_MakePoint(-77.1485498920083,-12.061553990178194),
    ST_MakePoint(-77.14853145182131,-12.061431037227003),
    ST_MakePoint(-77.14854586869478,-12.061341527443073),
    ST_MakePoint(-77.14859582483768,-12.061279231238826),
    ST_MakePoint(-77.1486534923315,-12.061246771631932),
    ST_MakePoint(-77.14874133467673,-12.061229394265006),
    ST_MakePoint(-77.1488244831562,-12.06122808276556),
    ST_MakePoint(-77.14889757335186,-12.061257919376157),
    ST_MakePoint(-77.14896328747272,-12.061316936837866),
    ST_MakePoint(-77.14900419116019,-12.061390052897421),
    ST_MakePoint(-77.14901726692915,-12.061455299947173),
    ST_MakePoint(-77.14897770434618,-12.061761534631897),
    ST_MakePoint(-77.15006165206431,-12.062444167863056),
    ST_MakePoint(-77.15014077723026,-12.062463512391348),
    ST_MakePoint(-77.15025443583727,-12.062434987408462),
    ST_MakePoint(-77.15044554322958,-12.062304493769856),
    ST_MakePoint(-77.15053874999285,-12.062303838022773),
    ST_MakePoint(-77.15087000280619,-12.062439905509173),
    ST_MakePoint(-77.15089749544859,-12.062478266691663),
    ST_MakePoint(-77.15077377855778,-12.062783188716201),
    ST_MakePoint(-77.15049549937247,-12.062817287501693),
    ST_MakePoint(-77.15024001896381,-12.063829757156144),
    ST_MakePoint(-77.15043146163225,-12.063993365073697),
    ST_MakePoint(-77.1504271030426,-12.064389433526806)])),4326)), 
('Fiscalía de la Nación',  ST_SetSRID(ST_MakePolygon(ST_MakeLine(ARRAY[
    ST_MakePoint(-77.14753702282906,-12.06098545525951),
    ST_MakePoint(-77.14733853936195,-12.060873977683125),
    ST_MakePoint(-77.14748069643974,-12.060593972036877),
    ST_MakePoint(-77.14768521487711,-12.060678563937405),
    ST_MakePoint(-77.14753702282906,-12.06098545525951)])),4326));

/*
        Cómo mostrar resultados (para terminal donde no se ve geometría):
*/

--Para puntos:
SELECT gid as "ID",nombre as "Nombre", ST_AsText(geom) as "Geometría" FROM prueba.punto;

-- Para líneas:

SELECT gid as "ID",nombre as "Nombre", ST_AsText(geom) as "Geometría" FROM prueba.linea;

-- Para polígonos:

SELECT gid as "ID",nombre as "Nombre", ST_AsText(geom) as "Geometría" FROM prueba.poligono;

/*
    Cómo mostar resultados (para cliente GUI donde se pueden ver geometrías)
*/

--Para puntos:
SELECT gid as "ID",nombre as "Nombre", geom as "Geometría" FROM prueba.punto;

-- Para líneas:

SELECT gid as "ID",nombre as "Nombre", geom as "Geometría" FROM prueba.linea;

-- Para polígonos:

SELECT gid as "ID",nombre as "Nombre", geom as "Geometría" FROM prueba.poligono;

/*
        Actualizar columna con datos
*/

-- Actualización del nombre de un dato de la tabla de poligono

UPDATE prueba.poligono SET
    nombre = 'Fortaleza Histórica Real Felipe'
WHERE gid = 1;

-- Más adelante habrá updates más complejos con funciones de postgis