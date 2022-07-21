package com.practicafinal.INCIO.converter;

import com.practicafinal.INCIO.entity.Gestionmapa;
import com.practicafinal.INCIO.model.GestionmapaModel;

public interface GestionmapaConverter {

	public Gestionmapa aEntity(GestionmapaModel model);
	
	public GestionmapaModel aModel(Gestionmapa entity);
}
