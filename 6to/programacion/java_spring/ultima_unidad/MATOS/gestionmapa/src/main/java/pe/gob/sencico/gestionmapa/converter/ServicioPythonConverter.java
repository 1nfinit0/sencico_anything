package pe.gob.sencico.gestionmapa.converter;

import pe.gob.sencico.gestionmapa.entity.ServicioPython;
import pe.gob.sencico.gestionmapa.model.ServicioPythonModel;

public interface ServicioPythonConverter {

    public ServicioPythonModel aModel(ServicioPython entity);
    
    public ServicioPython aEntity(ServicioPythonModel model);
}
