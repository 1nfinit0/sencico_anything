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
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer003 = L.tileLayer.wms('http://172.20.255.14:8081/geoserver/Practica_PUB/wms', {
    layers: 'Practica_PUB:limite_nacional',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer004 = L.tileLayer.wms('http://172.20.255.14:8081/geoserver/Practica_PUB/wms', {
    layers: 'Practica_PUB:cuencas',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer005 = L.tileLayer.wms('http://172.20.255.14:8081/geoserver/Practica_PUB/wms', {
    layers: 'Practica_PUB:rios',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer006 = L.tileLayer.wms('http://172.20.255.14:8081/geoserver/Practica_PUB_SANTA/wms', {
    layers: 'Practica_PUB_SANTA:SantaSubset',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var groupOverLays = {
    "Cartografía base IGN": {
        "Departamentos": layer001,
        "Límite Provincial": layer002,
        "Límite Nacional": layer003,
        "Cuencas": layer004,
        "Ríos": layer005,
        "Cuenca Santa": layer006
    }
};

L.control.groupedLayers(baseLayers, groupOverLays).addTo(map);
L.control.scale({position: 'bottomleft'}).addTo(map);

map.pm.addControls(options);