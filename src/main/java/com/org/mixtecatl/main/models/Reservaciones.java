package com.org.mixtecatl.main.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservaciones")
public class Reservaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservaciones", unique = true, nullable = false)
    private Long idReservaciones;

    @Column(name = "fechaReservacion", nullable = false)
    private LocalDateTime fechaReservacion;

    @Column(name = "nombreSolicitante", nullable = false)
    private String nombreSolicitante;

    @Column(name = "apellidoSolicitante", nullable = false)
    private String apellidoSolicitante;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "idMesas") //referencia de la FK
    private Mesas mesas;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = true) //referencia de la FK
    private Usuario usuario;

    public Reservaciones() {
    }

    public Reservaciones(LocalDateTime fechaReservacion,
                         String nombreSolicitante,
                         String apellidoSolicitante) {

        this.fechaReservacion = fechaReservacion;
        this.nombreSolicitante = nombreSolicitante;
        this.apellidoSolicitante = apellidoSolicitante;
    }
    //getters y setters

    public Long getIdReservaciones() {
        return idReservaciones;
    }

    public void setIdReservaciones(Long idReservaciones) {
        this.idReservaciones = idReservaciones;
    }

    public LocalDateTime getFechaReservacion() {
        return fechaReservacion;
    }

    public void setFechaReservacion(LocalDateTime fechaReservacion) {
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
        return mesas;
    }

    public void setMesa(Mesas mesas) {
        this.mesas = mesas;
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
                "idReservaciones=" + idReservaciones +
                ", fechaReservacion=" + fechaReservacion +
                ", nombreSolicitante='" + nombreSolicitante + '\'' +
                ", apellidoSolicitante='" + apellidoSolicitante + '\'' +
                ", mesa=" + mesas +
                '}';
    }
}
