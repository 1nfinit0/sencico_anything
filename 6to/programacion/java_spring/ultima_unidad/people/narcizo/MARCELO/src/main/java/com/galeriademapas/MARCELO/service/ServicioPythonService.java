package com.galeriademapas.MARCELO.service;

import java.util.List;

import com.galeriademapas.MARCELO.model.ServicioPythonModel;

public interface ServicioPythonService {

    public List<ServicioPythonModel> findAll();
    
    public void save(ServicioPythonModel model);
    
    public ServicioPythonModel findById(String id);
    
    public void deleteById(String id);
}