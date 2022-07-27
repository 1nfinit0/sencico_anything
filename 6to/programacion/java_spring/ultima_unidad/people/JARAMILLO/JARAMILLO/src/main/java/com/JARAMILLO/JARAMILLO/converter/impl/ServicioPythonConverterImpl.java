package com.JARAMILLO.JARAMILLO.converter.impl;

import org.springframework.stereotype.Component;

import com.JARAMILLO.JARAMILLO.converter.ServicioPythonConverter;
import com.JARAMILLO.JARAMILLO.entity.ServicioPython;
import com.JARAMILLO.JARAMILLO.model.ServicioPythonModel;


@Component("servicioPythonConverter")
public class ServicioPythonConverterImpl implements ServicioPythonConverter{

    @Override
    public ServicioPythonModel aModel(ServicioPython entity) {
        ServicioPythonModel model = new ServicioPythonModel(
                entity.getId(),
                entity.getUnidad(),
                entity.getSistemaOperativo(),
                entity.getComandoPython(),
                entity.getPathFicheroPython(),
                entity.getFicheroPython(),
                entity.getNombreSistema(),
                entity.getCreateAt()
        );
        
        return model;
    }

    @Override
    public ServicioPython aEntity(ServicioPythonModel model) {
        ServicioPython entity = new ServicioPython();
        
        entity.setId(model.getId());
        entity.setUnidad(model.getUnidad());
        entity.setSistemaOperativo(model.getSistemaOperativo());
        entity.setComandoPython(model.getComandoPython());
        entity.setPathFicheroPython(model.getPathFicheroPython());
        entity.setFicheroPython(model.getFicheroPython());
        entity.setNombreSistema(model.getNombreSistema());
        entity.setCreateAt(model.getCreateAt());
        
        return entity;
    }

}
