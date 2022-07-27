package com.mapas.CAJAHUANCA.converter;

import com.mapas.CAJAHUANCA.entity.ServicioPython;
import com.mapas.CAJAHUANCA.model.ServicioPythonModel;

public interface ServicioPythonConverter {

  public ServicioPythonModel aModel(ServicioPython entity);
  
  public ServicioPython aEntity(ServicioPythonModel model);
}
