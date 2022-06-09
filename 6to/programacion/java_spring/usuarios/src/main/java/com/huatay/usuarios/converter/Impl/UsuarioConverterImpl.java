package com.huatay.usuarios.converter.Impl;

import org.springframework.stereotype.Component;

import com.huatay.usuarios.converter.UsuarioConverter;
import com.huatay.usuarios.entity.UsuarioEntity;
import com.huatay.usuarios.model.UsuarioModel;

@Component("usuarioConverter")
public class UsuarioConverterImpl implements UsuarioConverter {

    @Override
    public UsuarioEntity aEntity(UsuarioModel model) {
        UsuarioEntity entity = new UsuarioEntity();
        entity.setId(model.getId());
        entity.setName(model.getName());
        entity.setLastName(model.getLastName());
        entity.setEmail(model.getEmail());
        return entity;
    }

    @Override
    public UsuarioModel aModel(UsuarioEntity entity) {
        UsuarioModel model = new UsuarioModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setLastName(entity.getLastName());
        model.setEmail(entity.getEmail());
        return model;
    }
}