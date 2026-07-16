package com.org.mixtecatl.main.services;


import com.org.mixtecatl.main.models.DetallePedido;
import com.org.mixtecatl.main.respositories.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallePedidoService {

    private final DetallePedidoRepository detallePedidoRepository;

    @Autowired
    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository) {
        this.detallePedidoRepository = detallePedidoRepository;
    }

    public List<DetallePedido> getDetallePedidos() {
        return detallePedidoRepository.findAll();
    }//getDetallePedidos

    public Optional<DetallePedido> getDetallePedido(Long id) {
        return detallePedidoRepository.findById(id);
    }//getDetallePedido

    public DetallePedido postDetallePedido(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }//postDetallePedido

    public DetallePedido putDetallePedido(Long id, DetallePedido detallePedidoActualizado) {

        Optional<DetallePedido> detallePedidoE = detallePedidoRepository.findById(id);

        if (detallePedidoE.isPresent()) {

            DetallePedido detallePedido = detallePedidoE.get();

            detallePedido.setCantidad(detallePedidoActualizado.getCantidad());
            detallePedido.setPrecioUnitario(detallePedidoActualizado.getPrecioUnitario());
            detallePedido.setSubtotal(detallePedidoActualizado.getSubtotal());

            return detallePedidoRepository.save(detallePedido);
        }

        return null;
    }//putDetallePedido

    public DetallePedido deleteDetallePedido(Long id) {

        Optional<DetallePedido> detallePedidoE = detallePedidoRepository.findById(id);

        if (detallePedidoE.isPresent()) {
            DetallePedido detallePedido = detallePedidoE.get();
            detallePedidoRepository.delete(detallePedido);
            return detallePedido;
        }

        return null;
    }//deleteDetallePedido

}//class DetallePedidoServic
