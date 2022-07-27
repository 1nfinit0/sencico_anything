package com.acosta.ACOSTA.converter;

import com.acosta.ACOSTA.entity.ServicioPython;
import com.acosta.ACOSTA.model.ServicioPythonModel;

public interface ServicioPythonConverter {

  public ServicioPythonModel aModel(ServicioPython entity);
  
  public ServicioPython aEntity(ServicioPythonModel model);
}
