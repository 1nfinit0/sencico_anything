package com.galeriademapas.MARCELO.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galeriademapas.MARCELO.converter.ServicioPythonConverter;
import com.galeriademapas.MARCELO.entity.ServicioPython;
import com.galeriademapas.MARCELO.model.ServicioPythonModel;
import com.galeriademapas.MARCELO.repository.ServicioPythonRepository;
import com.galeriademapas.MARCELO.service.ServicioPythonService;

@Service("servicioPythonService")
public class ServicioPythonServiceImpl implements ServicioPythonService{
    
    @Autowired
    @Qualifier("servicioPythonRepository")
    private ServicioPythonRepository servicioPythonRepository;
    
    @Autowired
    @Qualifier("servicioPythonConverter")
    private ServicioPythonConverter servicioPythonConverter;

    @Transactional(readOnly = true)
    @Override
    public List<ServicioPythonModel> findAll() {
        List<ServicioPython> entityList = servicioPythonRepository.findAll();
        List<ServicioPythonModel> modelList = new LinkedList<>();
        for(ServicioPython entity:entityList) {
            modelList.add(servicioPythonConverter.aModel(entity));
        }
        return modelList;
    }

    @Transactional
    @Override
    public void save(ServicioPythonModel model) {
        servicioPythonRepository.save(servicioPythonConverter.aEntity(model));
    }

    @Transactional(readOnly = true)
    @Override
    public ServicioPythonModel findById(String id) {
        return servicioPythonConverter.aModel(servicioPythonRepository.findById(id).orElse(null));
    }

    @Transactional
    @Override
    public void deleteById(String id) {
        servicioPythonRepository.deleteById(id);
    }

}

