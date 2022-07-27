package com.practicafinal.INCIO.service;

import java.util.List;

import com.practicafinal.INCIO.model.ServicioPythonModel;

public interface ServicioPythonService {

    public List<ServicioPythonModel> findAll();
    
    public void save(ServicioPythonModel model);
    
    public ServicioPythonModel findById(String id);
    
    public void deleteById(String id);
}
