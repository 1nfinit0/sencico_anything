var boundary = [-81.3899688720703, -18.4412956237793, -68.5886001586914, 0.0298568718135357];

var map = L.map('map', {
    center: [(boundary[1] + boundary[3]) / 2, (boundary[0] + boundary[2]) / 2],
    zoom: 5
});

// var defaultBase = L.tileLayer('https://{s}.basemaps.cartocdn.com/dark_all/{z}/{x}/{y}{r}.png').addTo(map);
var defaultBase = L.tileLayer.provider('CartoDB.DarkMatter').addTo(map);

var baseLayers = {
    'Dark Matter': defaultBase,
    'OpenStreetMap': L.tileLayer.provider('OpenStreetMap'),
    'OpenTopoMap': L.tileLayer.provider('OpenTopoMap'),
    'EsriWorldPhysical': L.tileLayer.provider('Esri.WorldPhysical'),
    'EsriWorldImagery': L.tileLayer.provider('Esri.WorldImagery')
};

var layer001 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_00_02/wms', {
    layers: 'g_00_02:00_02_002_03_000_000_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer002 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_00_02/wms', {
    layers: 'g_00_02:00_02_003_03_000_000_0000_00_00',
    format: 'image/png',
    transparent: true,
    tiled: 'true'
});
var layer003 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_03_04/wms', {
    layers: 'g_03_04:03_04_001_03_001_513_0000_00_00',
    format: 'image/png',
    transparent: true,
    tiled: 'true'
});
var layer004 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_01/wms', {
    layers: 'g_11_01:11_01_001_03_001_531_0000_00_00',
    format: 'image/png',
    transparent: true,
    tiled: 'true'
});
var layer005 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_02/wms', {
    layers: 'g_11_02:11_02_001_03_001_531_0000_00_00',
    format: 'image/png',
    transparent: true,
    tiled: 'true'
});
var layer006 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_03/wms', {
    layers: 'g_11_03:11_03_001_03_001_531_0000_00_00',
    format: 'image/png',
    transparent: true,
    tiled: 'true'
});
var layer007 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_04/wms', {
    layers: 'g_11_04:11_04_001_03_001_531_0000_00_00',
    format: 'image/png',
    transparent: true,
    tiled: 'true'
});
var layer008 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_05/wms', {
    layers: 'g_11_05:11_05_001_03_001_531_0000_00_00',
    format: 'image/png',
    transparent: true,
    tiled: 'true'
});
var layer009 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_06/wms', {
    layers: 'g_11_06:11_06_001_03_001_531_0000_00_00',
    format: 'image/png',
    transparent: true,
    tiled: 'true'
});
var layer010 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_00_06/wms', 
    {
    layers: 'g_00_06:00_06_001_03_000_000_0000_00_00',
    format: 'image/png',
    transparent: true,
    tiled: 'true'
});

var groupOverLays = {
    "Mapa Base": {
        "Departamentos ": layer001,
        "Provincias"    : layer002,
        "Radiación UV"  : layer003,
        "Riesgo de Arroz" : layer004,
        "Riesgo de Maiz" : layer005,
        "Riesgo de Papa" : layer006,
        "Riesgo de Cacao" : layer007,
        "Riesgo de Safé" : layer008,
        "Riesgo de Pasto" : layer009
    },
    "Cuencas": {
        "Cuencas"         : layer010
    }
};

L.control.groupedLayers(baseLayers, groupOverLays).addTo(map);
L.control.scale({position: 'bottomleft'}).addTo(map);

map.pm.addControls(options);