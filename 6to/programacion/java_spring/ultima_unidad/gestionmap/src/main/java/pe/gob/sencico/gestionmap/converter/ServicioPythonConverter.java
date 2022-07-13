package pe.gob.sencico.gestionmap.converter;

import pe.gob.sencico.gestionmap.entity.ServicioPython;
import pe.gob.sencico.gestionmap.model.ServicioPythonModel;

public interface ServicioPythonConverter {
    public ServicioPython aEntity(ServicioPythonModel model);
    public ServicioPythonModel aModel(ServicioPython entity);
}
