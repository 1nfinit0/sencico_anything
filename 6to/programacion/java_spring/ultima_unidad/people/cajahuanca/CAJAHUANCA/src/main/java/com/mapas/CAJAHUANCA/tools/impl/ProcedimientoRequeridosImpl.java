package com.mapas.CAJAHUANCA.tools.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mapas.CAJAHUANCA.model.ServicioPythonModel;
import com.mapas.CAJAHUANCA.service.ServicioPythonService;
import com.mapas.CAJAHUANCA.tools.ProcedimientoRequeridos;

@Component("procedimientoRequeridos")
public class ProcedimientoRequeridosImpl implements ProcedimientoRequeridos{

    @Autowired
    @Qualifier("servicioPythonService")
    private ServicioPythonService servicioPythonService;
    
    @Override
    public Date fechaCurrent() {
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        
        Date dateobj = calendar.getTime();
        String formattedDate = dtf.format(dateobj);
        
        Date createAt = null;
        try {
            createAt=dtf.parse(formattedDate);
        }catch(ParseException e) {
            System.out.println(e.getMessage());
        }
        return createAt;
    }

    @Override
    public void executeScriptPython(String id) {
        ServicioPythonModel model = servicioPythonService.findById(id);
        
        String pathPython = model.getComandoPython();
        String pathFicheroPython = model.getPathFicheroPython();
        String ficheroPython = model.getFicheroPython();
        String fetching = pathPython+ "condabin/conda activate sig & python " + pathFicheroPython + ficheroPython + " & conda deactivate";
        System.out.println(fetching);
        try {
            Process process = Runtime.getRuntime().exec("cmd /c " + fetching, null, new File(pathFicheroPython));
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            
            while((line=reader.readLine())!=null) {
                output.append(line+"\n");
            }
            
            int exitVal = process.waitFor();
            if(exitVal==0) {
                System.out.println("Success!");
            }else {
                System.out.println("abnormal!");
            }
            
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
