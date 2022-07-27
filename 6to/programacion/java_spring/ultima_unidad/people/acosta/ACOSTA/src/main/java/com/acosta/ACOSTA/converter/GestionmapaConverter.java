package com.acosta.ACOSTA.converter;

import com.acosta.ACOSTA.entity.Gestionmapa;
import com.acosta.ACOSTA.model.GestionmapaModel;

public interface GestionmapaConverter {

	public Gestionmapa aEntity(GestionmapaModel model);
	
	public GestionmapaModel aModel(Gestionmapa entity);
}
