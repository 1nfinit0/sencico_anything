package com.mtc.empleado.converter;

import com.mtc.empleado.entity.Empleado;
import com.mtc.empleado.model.EmpleadoModel;

public interface EmpleadoConverter {
    public Empleado aEntity(EmpleadoModel model);	
	public EmpleadoModel aModel(Empleado entity);
}
