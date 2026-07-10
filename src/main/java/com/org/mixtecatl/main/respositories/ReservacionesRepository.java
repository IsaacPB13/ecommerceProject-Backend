package com.org.mixtecatl.main.respositories;

import com.org.mixtecatl.main.models.Reservaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionesRepository extends JpaRepository<Reservaciones, Long> {

}