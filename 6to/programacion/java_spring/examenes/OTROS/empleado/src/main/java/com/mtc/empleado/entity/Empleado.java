package com.mtc.empleado.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado", schema = "mtc")
public class Empleado  implements Serializable{

    private static final long serialVersionUID = -4225106069213165072L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gid;

    @Column(name="appaterno")
    private String appaterno;

    @Column(name="apmaterno")
    private String apmaterno;

    @Column(name="nombre")
    private String nombre;

    @Column(name="dni")
    private String dni;

    @Column(name="telefono")
    private String telefono;

    @Column(name="correo")
    private String correo;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
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