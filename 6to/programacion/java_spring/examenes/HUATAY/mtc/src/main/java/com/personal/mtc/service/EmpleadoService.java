package com.personal.mtc.service;

import java.util.List;

import com.personal.mtc.model.EmpleadoModel;

public interface EmpleadoService {

    public List<EmpleadoModel> findAll();

	public void save(EmpleadoModel model);

	public EmpleadoModel findById(Long gid);
    
	public void deletebyId(Long gid);

}