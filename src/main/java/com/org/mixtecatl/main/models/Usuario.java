package com.org.mixtecatl.main.models;

import java.util.Date;

public class Usuario {

    private Long idUsuario;
    private String nombre;
    private String correo;
    private String password;
    private String telefono;
    private Date fechaRegistro;

    public Usuario(Long idUsuario, String nombre, String correo,
                   String password, String telefono, Date fechaRegistro) {

        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
    }// Usuario

    public Long getIdUsuario() {
        return idUsuario;
    }// get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}// Class Usuario