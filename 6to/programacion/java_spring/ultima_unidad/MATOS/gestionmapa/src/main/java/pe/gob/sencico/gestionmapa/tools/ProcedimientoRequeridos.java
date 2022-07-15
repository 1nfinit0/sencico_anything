package pe.gob.sencico.gestionmapa.tools;

import java.util.Date;

public interface ProcedimientoRequeridos {

    public Date fechaCurrent();
    
    public void executeScriptPython(String id);
}
