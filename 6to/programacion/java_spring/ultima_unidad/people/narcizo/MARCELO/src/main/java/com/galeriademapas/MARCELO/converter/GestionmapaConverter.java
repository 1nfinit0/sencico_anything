package com.galeriademapas.MARCELO.converter;

import com.galeriademapas.MARCELO.entity.Gestionmapa;
import com.galeriademapas.MARCELO.model.GestionmapaModel;

public interface GestionmapaConverter {

	public Gestionmapa aEntity(GestionmapaModel model);
	
	public GestionmapaModel aModel(Gestionmapa entity);
}

