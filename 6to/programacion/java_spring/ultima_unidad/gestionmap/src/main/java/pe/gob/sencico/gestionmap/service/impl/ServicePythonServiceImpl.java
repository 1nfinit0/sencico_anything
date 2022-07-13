package pe.gob.sencico.gestionmap.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pe.gob.sencico.gestionmap.converter.ServicioPythonConverter;
import pe.gob.sencico.gestionmap.entity.ServicioPython;
import pe.gob.sencico.gestionmap.model.ServicioPythonModel;
import pe.gob.sencico.gestionmap.repository.ServicioPythonRepository;
import pe.gob.sencico.gestionmap.service.ServicePythonService;

@Service("servicioPythonService")
public class ServicePythonServiceImpl implements ServicePythonService{
    
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