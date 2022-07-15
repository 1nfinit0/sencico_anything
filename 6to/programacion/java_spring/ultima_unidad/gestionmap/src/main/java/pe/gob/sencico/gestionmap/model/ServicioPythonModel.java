package pe.gob.sencico.gestionmap.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ServicioPythonModel {
    
    private String id;
    
    private String unidad;
    
    private String sistemaOperativo;
    
    private String comandoPython;

    private String pathFicheroPython;

    private String ficheroPython;

    private String nombreSistema;
    
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "America/Lima")
    private Date createAt;

    public ServicioPythonModel() {
    }

    public ServicioPythonModel(String id, String unidad, String sistemaOperativo, String comandoPython,
            String pathFicheroPython, String ficheroPython, String nombreSistema, Date createAt) {
        this.id = id;
        this.unidad = unidad;
        this.sistemaOperativo = sistemaOperativo;
        this.comandoPython = comandoPython;
        this.pathFicheroPython = pathFicheroPython;
        this.ficheroPython = ficheroPython;
        this.nombreSistema = nombreSistema;
        this.createAt = createAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getComandoPython() {
        return comandoPython;
    }

    public void setComandoPython(String comandoPython) {
        this.comandoPython = comandoPython;
    }

    public String getPathFicheroPython() {
        return pathFicheroPython;
    }

    public void setPathFicheroPython(String pathFicheroPython) {
        this.pathFicheroPython = pathFicheroPython;
    }

    public String getFicheroPython() {
        return ficheroPython;
    }

    public void setFicheroPython(String ficheroPython) {
        this.ficheroPython = ficheroPython;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    
}
