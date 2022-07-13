package pe.gob.sencico.gestionmap.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.sencico.gestionmap.converter.GestionMapConverter;
import pe.gob.sencico.gestionmap.entity.GestionMapEntity;
import pe.gob.sencico.gestionmap.model.GestionMapModel;
import pe.gob.sencico.gestionmap.repository.GestionMapRepository;
import pe.gob.sencico.gestionmap.service.GestionMapService;

@Service("gestionMapService")
public class GestionMapServiceImpl implements GestionMapService{

    @Autowired
    @Qualifier("gestionMapRepository")
    public GestionMapRepository gestionMapRepository;

    @Autowired
    @Qualifier("gestionMapConverter")
    public GestionMapConverter gestionMapConverter;

    @Override
    @Transactional(readOnly = true)
    public List<GestionMapModel> findAll() {
        List<GestionMapEntity> listEntity = gestionMapRepository.findAll();
        List<GestionMapModel> listModel = new LinkedList<>();
        for(GestionMapEntity entity:listEntity) {
            listModel.add(gestionMapConverter.aModel(entity));
        }
        return listModel;
    }

    @Override
    @Transactional(readOnly = true)
    public GestionMapModel findById(Long id) {
        return gestionMapConverter.aModel(gestionMapRepository.findById(id).orElse(null));
    }

    @Override
    @Transactional
    public void save(GestionMapModel model) {
        gestionMapRepository.save(gestionMapConverter.aEntity(model));
    }

    @Override
    public void deleteById(Long id) {
        gestionMapRepository.deleteById(id);
    }
}