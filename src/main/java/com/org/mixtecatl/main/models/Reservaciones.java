package com.org.mixtecatl.main.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Reservaciones")
public class Reservaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idReservaciones", unique = true, nullable = false)
    private Long idReservaciones;

    @Column(name = "Fecha_Reservacion", nullable = false)
    private LocalDateTime fechaReservacion;

    @Column(name = "Nombre_Solicitante", nullable = false)
    private String nombreSolicitante;

    @Column(name = "Apellido_Solicitante", nullable = false)
    private String apellidoSolicitante;

    @Column(name = "Mesas_idMesas", nullable = false)
    private Integer mesasIdMesas;

    public Reservaciones() {
    }

    public Reservaciones(LocalDateTime fechaReservacion,
                         String nombreSolicitante,
                         String apellidoSolicitante,
                         Integer mesasIdMesas) {

        this.fechaReservacion = fechaReservacion;
        this.nombreSolicitante = nombreSolicitante;
        this.apellidoSolicitante = apellidoSolicitante;
        this.mesasIdMesas = mesasIdMesas;
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

    public Integer getMesasIdMesas() {
        return mesasIdMesas;
    }

    public void setMesasIdMesas(Integer mesasIdMesas) {
        this.mesasIdMesas = mesasIdMesas;
    }
}
