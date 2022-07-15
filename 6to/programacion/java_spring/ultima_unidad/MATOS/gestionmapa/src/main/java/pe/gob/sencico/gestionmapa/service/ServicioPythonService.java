package pe.gob.sencico.gestionmapa.service;

import java.util.List;

import pe.gob.sencico.gestionmapa.model.ServicioPythonModel;

public interface ServicioPythonService {
	
    public List<ServicioPythonModel> findAll();
    
    public void save(ServicioPythonModel model);
    
    public ServicioPythonModel findById(String id);
    
    public void deleteById(String id);
    
}
