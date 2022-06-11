package com.personal.mtc.converter.impl;

import org.springframework.stereotype.Component;

import com.personal.mtc.converter.EmpleadoConverter;
import com.personal.mtc.entity.EmpleadoEntity;
import com.personal.mtc.model.EmpleadoModel;

@Component("empleadoConverter")
public class EmpleadoConverterImpl implements EmpleadoConverter {

    @Override
    public EmpleadoEntity aEntity(EmpleadoModel model) {
        EmpleadoEntity entity = new EmpleadoEntity();
        entity.setGid(model.getGid());
        entity.setaPaterno(model.getaPaterno());
        entity.setaMaterno(model.getaMaterno());
        entity.setNombre(model.getNombre());
        entity.setDni(model.getDni());
        entity.setTelefono(model.getTelefono());
        entity.setCorreo(model.getCorreo());
        return entity;
    }

    @Override
    public EmpleadoModel aModel(EmpleadoEntity entity) {
        EmpleadoModel model = new EmpleadoModel();
        model.setGid(entity.getGid());
        model.setaPaterno(entity.getaPaterno());
        model.setaMaterno(entity.getaMaterno());
        model.setNombre(entity.getNombre());
        model.setDni(entity.getDni());
        model.setTelefono(entity.getTelefono());
        model.setCorreo(entity.getCorreo());
        return model;
    }
}
