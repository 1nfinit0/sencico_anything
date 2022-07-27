package pe.gob.sencico.gestionmap.controller;

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

import pe.gob.sencico.gestionmap.service.ServicePythonService;
import pe.gob.sencico.gestionmap.tools.ProcedimientosRequeridos;


@RequestMapping("/servicio")
@CrossOrigin(origins = "*")
@RestController
public class ServicioPythonControllerRest {

    @Autowired
    @Qualifier("servicioPythonService")
    private ServicePythonService servicioPythonService;
    
    @Autowired
    @Qualifier("procedimientoRequeridos")
    private ProcedimientosRequeridos procedimientosRequeridos;
    
    @GetMapping(value = "/getUser/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getuser(@PathVariable(value = "id", required = true) String id){
        System.out.println(servicioPythonService.findById(id).toString());
        procedimientosRequeridos.executeScriptPython(id);
        return new ResponseEntity<>(servicioPythonService.findById(id),HttpStatus.OK);
    }
}