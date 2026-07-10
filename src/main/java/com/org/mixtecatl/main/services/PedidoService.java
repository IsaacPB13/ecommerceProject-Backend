package com.org.mixtecatl.main.services;

import com.org.mixtecatl.main.models.Pedido;
import com.org.mixtecatl.main.respositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }


    public List<Pedido> getPedidos() {
        return pedidoRepository.findAll();
    }//getPedidos


    public Optional<Pedido> getPedido(Long id) {
        return pedidoRepository.findById(id);
    }//getPedido


    public Pedido postPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }//postPedido


    public Pedido putPedido(Long id, Pedido pedidoActualizado) {

        Optional<Pedido> pedidoE = pedidoRepository.findById(id);

        if (pedidoE.isPresent()) {

            Pedido pedido = pedidoE.get();

            pedido.setFechaSolicitud(pedidoActualizado.getFechaSolicitud());
            pedido.setEstadoPedido(pedidoActualizado.getEstadoPedido());
            pedido.setPlatillo(pedidoActualizado.getPlatillo());
            pedido.setUsuario(pedidoActualizado.getUsuario());

            return pedidoRepository.save(pedido);
        }

        return null;
    }//putPedido


    public Pedido deletePedido(Long id) {
        Pedido pedido = null;
        if (pedidoRepository.existsById(id)) {
            pedido = pedidoRepository.findById(id).get();
            pedidoRepository.deleteById(id);
        }

        return pedido;
    }//deletePedido

}