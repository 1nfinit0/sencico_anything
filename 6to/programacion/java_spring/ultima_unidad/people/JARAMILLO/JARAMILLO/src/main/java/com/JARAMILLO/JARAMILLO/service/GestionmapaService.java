package com.JARAMILLO.JARAMILLO.service;

import java.util.List;

import com.JARAMILLO.JARAMILLO.model.GestionmapaModel;

public interface GestionmapaService {

	public List<GestionmapaModel> findAll();
	
	public GestionmapaModel findById(Long id);
	
	public void save(GestionmapaModel model);
	
	public void deleteById(Long id);
}

