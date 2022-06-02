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

var groupOverLays = {
    "Capas": {
        "Departamentos ": layer001,
        "Provincias"    : layer002
    }
};

L.control.groupedLayers(baseLayers, groupOverLays).addTo(map);
L.control.scale({position: 'bottomleft'}).addTo(map);

map.pm.addControls(options);