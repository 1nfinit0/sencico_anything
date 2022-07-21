package com.mapas.CAJAHUANCA.converter;

import com.mapas.CAJAHUANCA.entity.Gestionmapa;
import com.mapas.CAJAHUANCA.model.GestionmapaModel;

public interface GestionmapaConverter {

	public Gestionmapa aEntity(GestionmapaModel model);
	
	public GestionmapaModel aModel(Gestionmapa entity);
}
