package com.mtc.empleado.model;

public class EmpleadoModel {
    
    private Long gid;
    private String appaterno;
    private String apmaterno;
    private String nombre;
    private String dni;
    private String telefono;
    private String correo;
    
    public EmpleadoModel() {
    }
    
    public EmpleadoModel(Long gid, String appaterno, String apmaterno, String nombre, String dni, String telefono,
            String correo) {
        this.gid = gid;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
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
