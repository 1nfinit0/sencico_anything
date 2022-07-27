package com.practicafinal.INCIO.converter;

import com.practicafinal.INCIO.entity.ServicioPython;
import com.practicafinal.INCIO.model.ServicioPythonModel;

public interface ServicioPythonConverter {

  public ServicioPythonModel aModel(ServicioPython entity);
  
  public ServicioPython aEntity(ServicioPythonModel model);
}
