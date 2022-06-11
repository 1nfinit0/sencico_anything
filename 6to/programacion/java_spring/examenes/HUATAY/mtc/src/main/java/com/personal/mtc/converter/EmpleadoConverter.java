package com.personal.mtc.converter;

import com.personal.mtc.entity.EmpleadoEntity;
import com.personal.mtc.model.EmpleadoModel;

public interface EmpleadoConverter {
    
    public EmpleadoEntity aEntity(EmpleadoModel model);	
	public EmpleadoModel aModel(EmpleadoEntity entity);
}
