package com.org.mixtecatl.main.services;

import com.org.mixtecatl.main.models.Reservaciones;
import com.org.mixtecatl.main.respositories.ReservacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservacionesService {
    @Autowired
    private ReservacionesRepository reservacionesRepository;
    public Reservaciones crearReservacion(Reservaciones reservacion) {
        return reservacionesRepository.save(reservacion);
    }
}