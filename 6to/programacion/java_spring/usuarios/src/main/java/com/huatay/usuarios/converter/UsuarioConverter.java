package com.huatay.usuarios.converter;

import com.huatay.usuarios.entity.UsuarioEntity;
import com.huatay.usuarios.model.UsuarioModel;

public interface UsuarioConverter {
    public UsuarioEntity aEntity(UsuarioModel model);
    public UsuarioModel aModel(UsuarioEntity entity);
}
