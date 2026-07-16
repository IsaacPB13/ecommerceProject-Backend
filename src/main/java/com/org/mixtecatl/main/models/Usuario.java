package com.org.mixtecatl.main.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuarios")
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
    private String contrasena;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Pedido> pedidos = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Reservaciones> reservaciones = new ArrayList<>();

    public Usuario(){}// Constructor vacío

    public Usuario(String nombre, String correo,
                   String password, String telefono) {

        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = password;
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
        return contrasena;
    }// getPassword

    public void setPassword(String password) {
        this.contrasena = password;
    }// setPassword

    public String getTelefono() {
        return telefono;
    }// getTelefono

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }// setTelefono

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Reservaciones> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservaciones> reservaciones) {
        this.reservaciones = reservaciones;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", pedidos=" + pedidos +
                ", reservaciones=" + reservaciones +
                '}';
    }
}// Class Usuario