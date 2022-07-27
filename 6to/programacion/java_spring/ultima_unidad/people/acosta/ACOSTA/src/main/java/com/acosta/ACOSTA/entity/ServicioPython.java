package com.acosta.ACOSTA.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "serv_python", schema = "service")
public class ServicioPython implements Serializable{

    private static final long serialVersionUID = -5401715743190588395L;

    @Id
    @Column(name = "cod")
    private String id;
    
    private String unidad;
    
    @Column(name = "sist_ope")
    private String sistemaOperativo;
    
    @Column(name = "comando_python")
    private String comandoPython;
    
    @Column(name = "path_fichero_py")
    private String pathFicheroPython;
    
    @Column(name = "fichero_py")
    private String ficheroPython;
    
    @Column(name = "sistema")
    private String nombreSistema;
    
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "America/Lima")
    @Column(name = "create_ad")
    private Date createAt;

    public ServicioPython() {
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