package com.huatay.usuarios.service;

import java.util.List;

import com.huatay.usuarios.model.UsuarioModel;

public interface UsuarioService {
    
    public List<UsuarioModel> findAll();
    public UsuarioModel findById(Long id);
    public void save(UsuarioModel model);
    public void deleteById(Long id);
}
