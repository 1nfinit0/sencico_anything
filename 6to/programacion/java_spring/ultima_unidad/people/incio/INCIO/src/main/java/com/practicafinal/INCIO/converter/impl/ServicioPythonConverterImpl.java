package com.practicafinal.INCIO.converter.impl;

import org.springframework.stereotype.Component;

import com.practicafinal.INCIO.converter.ServicioPythonConverter;
import com.practicafinal.INCIO.entity.ServicioPython;
import com.practicafinal.INCIO.model.ServicioPythonModel;


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

