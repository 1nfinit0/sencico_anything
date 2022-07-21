package com.JARAMILLO.JARAMILLO.converter;

import com.JARAMILLO.JARAMILLO.entity.Gestionmapa;
import com.JARAMILLO.JARAMILLO.model.GestionmapaModel;

public interface GestionmapaConverter {

	public Gestionmapa aEntity(GestionmapaModel model);
	
	public GestionmapaModel aModel(Gestionmapa entity);
}

