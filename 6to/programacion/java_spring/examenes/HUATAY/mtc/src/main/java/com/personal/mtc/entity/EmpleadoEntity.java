package com.personal.mtc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="empleado", schema = "mtc")
public class EmpleadoEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gid;

    @Column(name="appaterno")
    private String aPaterno;

    @Column(name="apmaterno")
    private String aMaterno;

    @Column(name="nombre")
    private String nombre;

    @Column(name="dni")
    private String dni;

    @Column(name="telefono")
    private String telefono;

    @Column(name="correo")
    private String correo;
    
    public EmpleadoEntity () {
    }
    public Long getGid() {
        return gid;
    }
    public void setGid(Long gid) {
        this.gid = gid;
    }
    public String getaPaterno() {
        return aPaterno;
    }
    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }
    public String getaMaterno() {
        return aMaterno;
    }
    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
