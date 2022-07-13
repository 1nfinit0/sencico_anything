package pe.gob.sencico.gestionmap.service;

import java.util.List;

import pe.gob.sencico.gestionmap.model.GestionMapModel;

public interface GestionMapService {
    public List<GestionMapModel> findAll();
    
    public GestionMapModel findById(Long id);
    
    public void save(GestionMapModel model);
    
    public void deleteById(Long id);
}
