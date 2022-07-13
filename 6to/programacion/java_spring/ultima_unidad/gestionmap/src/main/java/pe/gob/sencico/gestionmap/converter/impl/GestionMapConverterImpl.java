package pe.gob.sencico.gestionmap.converter.impl;

import org.springframework.stereotype.Component;

import pe.gob.sencico.gestionmap.converter.GestionMapConverter;
import pe.gob.sencico.gestionmap.entity.GestionMapEntity;
import pe.gob.sencico.gestionmap.model.GestionMapModel;

@Component("gestionMapConverter")
public class GestionMapConverterImpl implements GestionMapConverter{

    @Override
    public GestionMapEntity aEntity(GestionMapModel model) {
        GestionMapEntity entity = new GestionMapEntity();
        entity.setId(model.getId());
        entity.setTitulo(model.getTitulo());
        entity.setDescripcion(model.getDescripcion());
        entity.setUrl(model.getUrl());
        entity.setService(model.getService());
        entity.setVersion(model.getVersion());
        entity.setRequest(model.getRequest());
        entity.setLayers(model.getLayers());
        entity.setStyles(model.getStyles());
        entity.setLongitudIzquierda(model.getLongitudIzquierda());
        entity.setLatitudIzquierda(model.getLatitudIzquierda());
        entity.setLongitudDerecha(model.getLongitudDerecha());
        entity.setLatitudDerecha(model.getLatitudDerecha());
        entity.setWidth(model.getWidth());
        entity.setHeight(model.getHeight());
        entity.setSrc(model.getSrc());
        entity.setFormat(model.getFormat());
        return entity;
    }

    @Override
    public GestionMapModel aModel(GestionMapEntity entity) {
        GestionMapModel model = new GestionMapModel();
        model.setId(entity.getId());
        model.setTitulo(entity.getTitulo());
        model.setDescripcion(entity.getDescripcion());
        model.setUrl((entity.getUrl().indexOf("?")==-1)?entity.getUrl()+"?":entity.getUrl());
        model.setService(entity.getService());
        model.setVersion(entity.getVersion());
        model.setRequest(entity.getRequest());
        model.setLayers(entity.getLayers());
        model.setStyles(entity.getStyles());
        model.setLongitudIzquierda(entity.getLongitudIzquierda());
        model.setLatitudIzquierda(entity.getLatitudIzquierda());
        model.setLongitudDerecha(entity.getLongitudDerecha());
        model.setLatitudDerecha(entity.getLatitudDerecha());
        model.setWidth(entity.getWidth());
        model.setHeight(entity.getHeight());
        model.setSrc(entity.getSrc());
        model.setFormat(entity.getFormat());

        model.setUrlcompleta(model.getUrl()+"service="+model.getService()+"&version="+model.getVersion()+"&request="+model.getRequest()+"&layers="+model.getLayers()+"&bbox="+model.getLongitudIzquierda()+","+model.getLatitudIzquierda()+","+model.getLongitudDerecha()+","+model.getLatitudDerecha()+"&width="+model.getWidth()+"&height="+model.getHeight()+"&src="+model.getSrc()+"&styles="+model.getStyles()+"&format="+model.getFormat());
        model.setUrlwfs(model.getUrl().replaceAll("wms", "ows")+"service=WFS&version=1.0.0&request=GetFeature&typeName="+model.getLayers()+"&maxFeatures=1000000&outputFormat=SHAPE-ZIP");
        model.setUrlLegendGraphic(entity.getUrl()+"REQUEST=GetLegendGraphic&VERSION=1.0.0&FORMAT=image/png&WIDTH=20&HEIGHT=20&LAYER="+entity.getLayers());
        

        return model;
    }
}
