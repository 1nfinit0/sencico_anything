package com.acosta.ACOSTA.service;

import com.acosta.ACOSTA.model.ServicioPythonModel;

import java.util.List;

public interface ServicioPythonService {

    public List<ServicioPythonModel> findAll();
    
    public void save(ServicioPythonModel model);
    
    public ServicioPythonModel findById(String id);
    
    public void deleteById(String id);
}
