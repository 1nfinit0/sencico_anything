package com.huatay.usuarios.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huatay.usuarios.converter.UsuarioConverter;
import com.huatay.usuarios.entity.UsuarioEntity;
import com.huatay.usuarios.model.UsuarioModel;
import com.huatay.usuarios.repository.UsuarioRepository;
import com.huatay.usuarios.service.UsuarioService;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    @Qualifier("usuarioRepository")
    private UsuarioRepository usuarioRepository;

    @Autowired
    @Qualifier("usuarioConverter")
    private UsuarioConverter usuarioConverter;

    @Override
    @Transactional(readOnly = true)
    public List<UsuarioModel> findAll() {
        List <UsuarioEntity> listEntities = usuarioRepository.findAll();
        List <UsuarioModel> listModels = new LinkedList<>();
        for (UsuarioEntity entity : listEntities) {
            UsuarioModel model = new UsuarioModel();
            model = usuarioConverter.aModel(entity);
            listModels.add(model);
        }
        return listModels;
    }

    @Override
    @Transactional(readOnly = true)
    public UsuarioModel findById(Long id) {
        UsuarioModel model = usuarioConverter.aModel(usuarioRepository.findById(id).orElse(null));
        return model;
    }

    @Override
    @Transactional
    public void save(UsuarioModel model) {
        usuarioRepository.save(usuarioConverter.aEntity(model));
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
