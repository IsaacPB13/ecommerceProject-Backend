package com.org.mixtecatl.main.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mesas")
public class Mesas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMesas", unique = true, nullable = false)
    private Long idMesas;

    @Column(name = "disponibilidad", nullable = false)
    private boolean disponibilidad;

    @JsonManagedReference
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "Mesas") //uno a muchos, indica que aqui inicia la relación
    private Reservaciones reservacion;

    public Mesas(){}

    public Mesas(boolean disponibilidad){

        this.disponibilidad = disponibilidad;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Long getIdMesas() {
        return idMesas;
    }

    public Reservaciones getReservacion() {
        return reservacion;
    }

    @Override
    public String toString() {
        return "Mesas{" +
                "idMesas=" + idMesas +
                ", disponibilidad=" + disponibilidad +
                ", reservaciones=" + reservacion +
                '}';
    }
}
