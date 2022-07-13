package pe.gob.sencico.gestionmap.converter;

import pe.gob.sencico.gestionmap.entity.GestionMapEntity;
import pe.gob.sencico.gestionmap.model.GestionMapModel;

public interface GestionMapConverter {
    public GestionMapEntity aEntity(GestionMapModel model);
    public GestionMapModel aModel(GestionMapEntity entity);
}
