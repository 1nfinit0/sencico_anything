package com.mtc.empleado.service;

import java.util.List;

import com.mtc.empleado.model.EmpleadoModel;

public interface EmpleadoService {
        
        public List<EmpleadoModel> findAll();
        
        public void save(EmpleadoModel model);
        
        public EmpleadoModel findById(Long gid);
        
        public void deletebyId(Long gid);
}
