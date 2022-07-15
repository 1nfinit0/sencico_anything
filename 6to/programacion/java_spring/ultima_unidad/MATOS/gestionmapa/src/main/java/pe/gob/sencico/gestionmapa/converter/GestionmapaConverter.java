package pe.gob.sencico.gestionmapa.converter;

import pe.gob.sencico.gestionmapa.entity.Gestionmapa;
import pe.gob.sencico.gestionmapa.model.GestionmapaModel;

public interface GestionmapaConverter {

	public Gestionmapa aEntity(GestionmapaModel model);
	
	public GestionmapaModel aModel(Gestionmapa entity);
}
