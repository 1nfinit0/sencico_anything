package com.galeriademapas.MARCELO.converter;

import com.galeriademapas.MARCELO.entity.ServicioPython;
import com.galeriademapas.MARCELO.model.ServicioPythonModel;

public interface ServicioPythonConverter {

  public ServicioPythonModel aModel(ServicioPython entity);
  
  public ServicioPython aEntity(ServicioPythonModel model);
}
