package com.mtc.empleado.converter.Impl;

import org.springframework.stereotype.Component;

import com.mtc.empleado.converter.EmpleadoConverter;
import com.mtc.empleado.entity.Empleado;
import com.mtc.empleado.model.EmpleadoModel;

@Component("empleadoConverter")
public class EmpleadoConverterImpl implements EmpleadoConverter{

    @Override
    public Empleado aEntity(EmpleadoModel model) {
        Empleado entity = new Empleado();
        entity.setGid(model.getGid());
        entity.setAppaterno(model.getAppaterno());
        entity.setApmaterno(model.getApmaterno());
        entity.setNombre(model.getNombre());
        entity.setDni(model.getDni());
        entity.setTelefono(model.getTelefono());
        entity.setCorreo(model.getCorreo());
        return entity;
    }

    @Override
    public EmpleadoModel aModel(Empleado entity) {
        EmpleadoModel model = new EmpleadoModel();
        model.setGid(entity.getGid());
        model.setAppaterno(entity.getAppaterno());
        model.setApmaterno(entity.getApmaterno());
        model.setNombre(entity.getNombre());
        model.setDni(entity.getDni());
        model.setTelefono(entity.getTelefono());
        model.setCorreo(entity.getCorreo());
        return model;
    }
    
}
