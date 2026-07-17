package com.org.mixtecatl.main.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservaciones")
public class Reservaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservacion", unique = true, nullable = false)
    private Long idReservacion;

    @Column(name = "fechaReservacion", nullable = false)
    private String fechaReservacion;

    @Column(name = "nombreSolicitante", nullable = false)
    private String nombreSolicitante;

    @Column(name = "apellidoSolicitante", nullable = false)
    private String apellidoSolicitante;

    @JsonBackReference("reservacion-mesa")
    @ManyToOne
    @JoinColumn(name = "idMesa") //referencia de la FK
    private Mesas mesa;

    @JsonBackReference("usuario-reservaciones")
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = true) //referencia de la FK
    private Usuario usuario;

    public Reservaciones() {
    }

    public Reservaciones(String fechaReservacion,
                         String nombreSolicitante,
                         String apellidoSolicitante) {

        this.fechaReservacion = fechaReservacion;
        this.nombreSolicitante = nombreSolicitante;
        this.apellidoSolicitante = apellidoSolicitante;
    }
    //getters y setters

    public Long getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservaciones(Long idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(String fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getApellidoSolicitante() {
        return apellidoSolicitante;
    }

    public void setApellidoSolicitante(String apellidoSolicitante) {
        this.apellidoSolicitante = apellidoSolicitante;
    }

    public Mesas getMesa() {
        return mesa;
    }

    public void setMesa(Mesas mesa) {
        this.mesa = mesa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Reservaciones{" +
                "idReservaciones=" + idReservacion +
                ", fechaReservacion=" + fechaReservacion +
                ", nombreSolicitante='" + nombreSolicitante + '\'' +
                ", apellidoSolicitante='" + apellidoSolicitante + '\'' +
                ", mesa=" + mesa +
                '}';
    }
}
