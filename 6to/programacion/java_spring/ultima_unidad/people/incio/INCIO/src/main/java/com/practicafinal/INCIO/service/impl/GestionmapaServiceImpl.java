package com.practicafinal.INCIO.service.impl;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practicafinal.INCIO.converter.GestionmapaConverter;
import com.practicafinal.INCIO.entity.Gestionmapa;
import com.practicafinal.INCIO.model.GestionmapaModel;
import com.practicafinal.INCIO.repository.GestionmapaRepository;
import com.practicafinal.INCIO.service.GestionmapaService;

@Service("gestionmapaService")
public class GestionmapaServiceImpl implements GestionmapaService{

	@Autowired
	@Qualifier("gestionmapaRepository")
	private GestionmapaRepository gestionmapaRepository;
	
	@Autowired
	@Qualifier("gestionmapaConverter")
	private GestionmapaConverter gestionmapaConverter;
	
	@Override
	@Transactional(readOnly = true)
	public List<GestionmapaModel> findAll() {
		List<Gestionmapa> listEntity = gestionmapaRepository.findAll();
		List<GestionmapaModel> listModel = new LinkedList<>();
		for(Gestionmapa entity:listEntity) {
			listModel.add(gestionmapaConverter.aModel(entity));
		}
		return listModel;
	}

	@Override
	@Transactional(readOnly = true)
	public GestionmapaModel findById(Long id) {
		return gestionmapaConverter.aModel(gestionmapaRepository.findById(id).orElse(null));
	}

	@Override
	@Transactional
	public void save(GestionmapaModel model) {
		gestionmapaRepository.save(gestionmapaConverter.aEntity(model));
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		gestionmapaRepository.deleteById(id);
	}

}
