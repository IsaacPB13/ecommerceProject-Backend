package com.org.mixtecatl.main.controllers;


import com.org.mixtecatl.main.models.Pedido;
import com.org.mixtecatl.main.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping
    public List<Pedido> getPedidos() {
        return pedidoService.getPedidos();
    }//getPedidos


    @GetMapping("/{id}")
    public Optional<Pedido> getPedido(@PathVariable Long id) {
        return pedidoService.getPedido(id);
    }//getPedido


    @PostMapping
    public Pedido postPedido(@RequestBody Pedido pedido) {
        return pedidoService.postPedido(pedido);
    }//postPedido


    @PutMapping("/{id}")
    public Pedido putPedido(@PathVariable Long id, @RequestBody Pedido pedido) {
        return pedidoService.putPedido(id, pedido);
    } // putPedido


    @DeleteMapping("/{id}")
    public Pedido deletePedido(@PathVariable Long id) {

        return pedidoService.deletePedido(id);
    }//deletePedido
}//class PedidoController