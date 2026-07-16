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
    @Column(name = "idMesa", unique = true, nullable = false)
    private Long idMesa;

    @Column(name = "disponibilidad", nullable = false)
    private boolean disponibilidad;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mesa") //uno a muchos, indica que aqui inicia la relación
    private List<Reservaciones> reservaciones;

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

    public Long getIdMesa() {
        return idMesa;
    }

    public List<Reservaciones> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservaciones> reservaciones) {
        this.reservaciones = reservaciones;
    }

    @Override
    public String toString() {
        return "Mesas{" +
                "idMesa=" + idMesa +
                ", disponibilidad=" + disponibilidad +
                ", reservaciones=" + reservaciones +
                '}';
    }
}
