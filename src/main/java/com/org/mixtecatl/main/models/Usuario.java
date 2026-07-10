package com.org.mixtecatl.main.models;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioId", unique = true, nullable = false)
    private Long usuarioId;

    @Column(name = "Nombre", nullable = false)
    private String nombre;

    @Column(name = "Correo", nullable = false)
    private String correo;

    @Column(name = "Contraseña", nullable = false)
    private String password;

    @Column(name = "Telefono", nullable = false)
    private String telefono;

    public Usuario(){}// Constructor vacío

    public Usuario(String nombre, String correo,
                   String password, String telefono) {

        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;

    }// Constructor Usuario

    public Long getUsuarioId() {
        return usuarioId;
    }// getUsuarioId

    public String getNombre() {
        return nombre;
    }// getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }// setNombre

    public String getCorreo() {
        return correo;
    }// getCorreo

    public void setCorreo(String correo) {
        this.correo = correo;
    }// setCorreo

    public String getPassword() {
        return password;
    }// getPassword

    public void setPassword(String password) {
        this.password = password;
    }// setPassword

    public String getTelefono() {
        return telefono;
    }// getTelefono

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }// setTelefono

}// Class Usuario