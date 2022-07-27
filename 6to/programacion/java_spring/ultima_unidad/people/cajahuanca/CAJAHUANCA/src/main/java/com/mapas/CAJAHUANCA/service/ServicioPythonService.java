package com.mapas.CAJAHUANCA.service;

import java.util.List;

import com.mapas.CAJAHUANCA.model.ServicioPythonModel;

public interface ServicioPythonService {

    public List<ServicioPythonModel> findAll();
    
    public void save(ServicioPythonModel model);
    
    public ServicioPythonModel findById(String id);
    
    public void deleteById(String id);
}
