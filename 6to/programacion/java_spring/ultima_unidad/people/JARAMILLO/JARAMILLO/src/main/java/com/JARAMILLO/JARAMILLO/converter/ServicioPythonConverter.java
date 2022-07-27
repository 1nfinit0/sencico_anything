package com.JARAMILLO.JARAMILLO.converter;

import com.JARAMILLO.JARAMILLO.entity.ServicioPython;
import com.JARAMILLO.JARAMILLO.model.ServicioPythonModel;

public interface ServicioPythonConverter {

  public ServicioPythonModel aModel(ServicioPython entity);
  
  public ServicioPython aEntity(ServicioPythonModel model);
}
