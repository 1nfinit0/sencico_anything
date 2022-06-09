var boundary = [-81.3899688720703, -18.4412956237793, -68.5886001586914, 0.0298568718135357];

var map = L.map('map', {
    center: [(boundary[1] + boundary[3]) / 2, (boundary[0] + boundary[2]) / 2],
    zoom: 6
});

var defaultBase = L.tileLayer.provider('OpenStreetMap').addTo(map);
var baseLayers = {
    'Streets': defaultBase,
    'OpenTopoMap': L.tileLayer.provider('OpenTopoMap'),
    'EsriWorldPhysical': L.tileLayer.provider('Esri.WorldPhysical'),
    'EsriWorldImagery': L.tileLayer.provider('Esri.WorldImagery')
};

var layer001 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_13/wms', {
    layers: 'g_06_13:06_13_001_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer002 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_13/wms', {
    layers: 'g_06_13:06_13_002_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer003 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_13/wms', {
    layers: 'g_06_13:06_13_003_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer004 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_13/wms', {
    layers: 'g_06_13:06_13_004_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer005 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_13/wms', {
    layers: 'g_06_13:06_13_005_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer006 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_14/wms', {
    layers: 'g_06_14:06_14_001_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer007 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_14/wms', {
    layers: 'g_06_14:06_14_002_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer008 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_14/wms', {
    layers: 'g_06_14:06_14_003_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer009 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_14/wms', {
    layers: 'g_06_14:06_14_004_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer010 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_14/wms', {
    layers: 'g_06_14:06_14_005_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer011 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_15/wms', {
    layers: 'g_06_15:06_15_001_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer012 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_15/wms', {
     layers: 'g_06_15:06_15_002_03_001_513_0000_00_00',
     format: 'image/png',
     opacity: 1,
     transparent: true,
     tiled: 'true'
});
var layer013 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_15/wms', {
    layers: 'g_06_15:06_15_003_03_001_513_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer014 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_15/wms', {
     layers: 'g_06_15:06_15_004_03_001_513_0000_00_00',
     format: 'image/png',
     opacity: 1,
     transparent: true,
     tiled: 'true'
});
var layer015 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_15/wms', {
     layers: 'g_06_15:06_15_005_03_001_513_0000_00_00',
     format: 'image/png',
     opacity: 1,
     transparent: true,
     tiled: 'true'
});
var layer016 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_10/wms', {
    layers: 'g_06_10:06_10_001_03_001_512_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer017 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_10/wms', {
    layers: 'g_06_10:06_10_002_03_001_512_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer018 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_10/wms', {
    layers: 'g_06_10:06_10_003_03_001_512_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer019 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_10/wms', {
    layers: 'g_06_10:06_10_004_03_001_512_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer020 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_10/wms', {
    layers: 'g_06_10:06_10_005_03_001_512_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer021 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_10/wms', {
    layers: 'g_06_10:06_10_006_03_001_512_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer022 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_06_10/wms', {
    layers: 'g_06_10:06_10_007_03_001_512_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});

var groupOverLays = {
    "Cambio de Precipitación": {
        "2050 - ANUAL": layer001,
        "2050 - VERANO": layer002,
        "2050 - INVIERNO": layer003,
        "2050 - OTOÑO": layer004,
        "PRIMAVERA": layer005
    },
    "Cambio de Temperatura mínima": {
        "2050 - ANUAL": layer006,
        "2050 - VERANO": layer007,
        "2050 - INVIERNO": layer008,
        "2050 - OTOÑO": layer009,
        "PRIMAVERA": layer010
    },
    "Cambio de Temperatura máxima": {
        "2050 - ANUAL": layer011,
        "2050 - VERANO": layer012,
        "2050 - INVIERNO": layer013,
        "2050 - OTOÑO": layer014,
        "2050 - PRIMAVERA": layer015
    },
    "Tendencia de temperatura máxima": {
        "01 ENERO - PERÚ" : layer016,
        "02 FEBRERO - PERÚ" : layer017,
        "03 MARZO - PERÚ" : layer018,
        "04 ABRIL - PERÚ" : layer019,
        "05 MAYO - PERÚ" : layer020,
        "06 JUNIO - PERÚ" : layer021,
        "07 JULIO - PERÚ" : layer022
    }
};

L.control.groupedLayers(baseLayers, groupOverLays).addTo(map);

L.control.scale({position: 'bottomleft'}).addTo(map);

map.pm.addControls(options);

