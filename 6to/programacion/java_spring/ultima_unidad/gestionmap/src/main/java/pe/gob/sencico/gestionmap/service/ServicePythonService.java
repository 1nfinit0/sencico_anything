package pe.gob.sencico.gestionmap.service;

import java.util.List;

import pe.gob.sencico.gestionmap.model.ServicioPythonModel;

public interface ServicePythonService {    

        public List<ServicioPythonModel> findAll();
        
        public void save(ServicioPythonModel model);
        
        public ServicioPythonModel findById(String id);
        
        public void deleteById(String id);
}
