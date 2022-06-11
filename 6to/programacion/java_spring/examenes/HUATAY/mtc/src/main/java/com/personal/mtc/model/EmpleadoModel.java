package com.personal.mtc.model;

public class EmpleadoModel {

    private Long gid;
    private String aPaterno;
    private String aMaterno;
    private String nombre;
    private String dni;
    private String telefono;
    private String correo;

    public EmpleadoModel(){

    };

    public EmpleadoModel(Long gid, String aPaterno, String aMaterno, String nombre, String dni, String telefono,
            String correo) {
        this.gid = gid;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
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
