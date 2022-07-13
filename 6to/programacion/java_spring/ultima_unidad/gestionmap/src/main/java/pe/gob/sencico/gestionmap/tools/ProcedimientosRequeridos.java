package pe.gob.sencico.gestionmap.tools;

import java.util.Date;

public interface ProcedimientosRequeridos {
    public Date fechaCurrent();
    
    public void executeScriptPython(String id);
}
