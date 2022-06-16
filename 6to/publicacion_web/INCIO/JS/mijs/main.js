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
var layer023 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_05/wms', {
    layers: 'g_11_05:11_05_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer024 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_04/wms', {
    layers: 'g_11_04:11_04_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer025 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_03/wms', {
    layers: 'g_11_03:11_03_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer026 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_02/wms', {
    layers: 'g_11_02:11_02_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer027 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_01/wms', {
    layers: 'g_11_01:11_01_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer028 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_06/wms', {
    layers: 'g_11_06:11_06_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer029 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_10/wms', {
    layers: 'g_11_10:11_10_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer030 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_09/wms', {
    layers: 'g_11_09:11_09_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer031 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_08/wms', {
    layers: 'g_11_08:11_08_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer032 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_11_07/wms', {
    layers: 'g_11_07:11_07_001_03_001_531_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer033 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_00_02/wms', {
    layers: 'g_00_02:00_02_002_03_000_000_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer034 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_00_02/wms', {
    layers: 'g_00_02:00_02_003_03_000_000_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer035 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_00_06/wms', {
    layers: 'g_00_06:00_06_001_03_000_000_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer036 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_00_05/wms', {
    layers: 'g_00_05:00_05_001_03_000_000_0000_00_00',
    format: 'image/png',
    opacity: 1,
    transparent: true,
    tiled: 'true'
});
var layer037 = L.tileLayer.wms('http://idesep.senamhi.gob.pe:80/geoserver/g_00_05/wms', {
    layers: 'g_00_05:00_05_002_03_000_000_0000_00_00',
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
    },
    "Riesgo Agroclimático": {
        "RIESGO AGROCLIMATICO DE CAFE" : layer023,
        "RIESGO AGROCLIMATICO DE CACAO" : layer024,
        "RIESGO AGROCLIMATICO DE PAPA" : layer025,
        "RIESGO AGROCLIMATICO DE MAIZ" : layer026,
        "RIESGO AGROCLIMATICO DE ARROZ" : layer027,
        "RIESGO AGROCLIMATICO DE PASTO" : layer028,
        "RIESGO AGROCLIMATICO DE FRIJOL GRANO SECO" : layer029,
        "RIESGO AGROCLIMATICO DE CEBOLLA" : layer030,
        "RIESGO AGROCLIMATICO DE PALTO" : layer031,
        "RIESGO AGROCLIMATICO DE QUINUA" : layer032
    },
    "Límites": {
        "LIMITE DE DEPARTAMENTO - PERU" : layer033,
        "LIMITE DE PROVINCIA - PERU" : layer034
    },
    "Hidrografía": {
        "CUENCAS HIDROGRAFICAS - PERU" : layer035,
        "HIDROGRAFIA - PERU" : layer036,
        "LAGOS - PERU" : layer037
    }
};

L.control.groupedLayers(baseLayers, groupOverLays).addTo(map);

L.control.scale({position: 'bottomleft'}).addTo(map);

map.pm.addControls(options);

