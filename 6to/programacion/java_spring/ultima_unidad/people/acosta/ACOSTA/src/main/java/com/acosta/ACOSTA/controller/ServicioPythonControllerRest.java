package com.acosta.ACOSTA.controller;
import com.acosta.ACOSTA.service.ServicioPythonService;
import com.acosta.ACOSTA.tools.ProcedimientoRequeridos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/servicio")
@CrossOrigin(origins = "*")
@RestController
public class ServicioPythonControllerRest {

    @Autowired
    @Qualifier("servicioPythonService")
    private ServicioPythonService servicioPythonService;
    
    @Autowired
    @Qualifier("procedimientoRequeridos")
    private ProcedimientoRequeridos procedimientoRequeridos;
    
    @GetMapping(value = "/getUser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getuser(@PathVariable(value = "id", required = true) String id){
        System.out.println(servicioPythonService.findById(id).toString());
        procedimientoRequeridos.executeScriptPython(id);
        return new ResponseEntity<>(servicioPythonService.findById(id),HttpStatus.OK);
    }
}
