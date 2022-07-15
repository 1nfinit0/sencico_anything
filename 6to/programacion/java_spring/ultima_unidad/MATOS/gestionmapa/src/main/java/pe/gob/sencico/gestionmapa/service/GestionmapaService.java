package pe.gob.sencico.gestionmapa.service;

import java.util.List;

import pe.gob.sencico.gestionmapa.model.GestionmapaModel;

public interface GestionmapaService {

	public List<GestionmapaModel> findAll();
	
	public GestionmapaModel findById(Long id);
	
	public void save(GestionmapaModel model);
	
	public void deleteById(Long id);
}
