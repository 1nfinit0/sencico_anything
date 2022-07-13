package com.personal.mtc.service.Impl;

import com.personal.mtc.converter.EmpleadoConverter;
import com.personal.mtc.entity.EmpleadoEntity;
import com.personal.mtc.model.EmpleadoModel;
import com.personal.mtc.repository.EmpleadoRepository;
import com.personal.mtc.service.EmpleadoService;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("empleadoService")
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    @Qualifier("empleadoRepository")
    private EmpleadoRepository empleadoRepository;

    @Autowired
    @Qualifier("empleadoConverter")
    private EmpleadoConverter empleadoConverter;

    @Override
    @Transactional(readOnly = true)
    public List<EmpleadoModel> findAll() {
        List<EmpleadoEntity> listEntity = empleadoRepository.findAll();
        List<EmpleadoModel> listModel = new LinkedList<>();
        for (EmpleadoEntity entity : listEntity) {
            listModel.add(empleadoConverter.aModel(entity));
        }
        return listModel;
    }

    @Override
    @Transactional
    public void save(EmpleadoModel model) {
        empleadoRepository.save(empleadoConverter.aEntity(model));
    }

    @Override
    @Transactional(readOnly = true)
    public EmpleadoModel findById(Long gid) {
        EmpleadoModel model = empleadoConverter.aModel(empleadoRepository.findById(gid).orElse(null));
        return model;
    }

    @Override
    @Transactional
    public void deletebyId(Long gid) {
        empleadoRepository.deleteById(gid);   
    }
}