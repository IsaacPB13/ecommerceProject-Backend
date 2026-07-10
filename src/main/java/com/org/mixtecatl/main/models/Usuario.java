package com.org.mixtecatl.main.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario", unique = true, nullable = false)
    private Long idUsuario;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    public Usuario(){}// Constructor vacío

    public Usuario(String nombre, String correo,
                   String password, String telefono) {

        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;

    }// Constructor Usuario

    public Long getIdUsuario() {
        return idUsuario;
    }// getIdUsuario

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }// setIdUsuario

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

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }// toString
}// Class Usuario