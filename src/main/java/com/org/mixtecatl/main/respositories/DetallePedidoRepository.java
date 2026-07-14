package com.org.mixtecatl.main.respositories;


import com.org.mixtecatl.main.models.DetallePedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallePedidoRepository extends JpaRepository<DetallePedido, Long> {


}// DetallePedidoRepository
