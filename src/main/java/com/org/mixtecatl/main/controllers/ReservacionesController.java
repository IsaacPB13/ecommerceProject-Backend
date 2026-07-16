package com.org.mixtecatl.main.controllers;

import com.org.mixtecatl.main.models.Reservaciones;
import com.org.mixtecatl.main.services.ReservacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/mixapi/reservaciones/")
public class ReservacionesController {

    private final ReservacionesService reservacionesService;

    @Autowired
    public ReservacionesController(ReservacionesService service) {
        this.reservacionesService = service;
    }

    @PostMapping
    public Reservaciones crearReservacion(@RequestBody Reservaciones reservacion) {
        return reservacionesService.crearReservacion(reservacion);
    }
}