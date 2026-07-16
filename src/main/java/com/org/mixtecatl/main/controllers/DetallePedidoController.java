package com.org.mixtecatl.main.controllers;

import com.org.mixtecatl.main.models.DetallePedido;
import com.org.mixtecatl.main.services.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mixapi/detallePedidos")
@CrossOrigin(origins = "*")
public class DetallePedidoController {

    private final DetallePedidoService detallePedidoService;

    @Autowired
    public DetallePedidoController(DetallePedidoService detallePedidoService) {
        this.detallePedidoService = detallePedidoService;
    }

    @GetMapping
    public List<DetallePedido> getDetallePedidos() {
        return detallePedidoService.getDetallePedidos();
    }//getDetallePedidos


    @GetMapping("/{id}")
    public Optional<DetallePedido> getDetallePedido(@PathVariable Long id) {
        return detallePedidoService.getDetallePedido(id);
    }//getDetallePedido


    @PostMapping
    public DetallePedido postDetallePedido(@RequestBody DetallePedido detallePedido) {
        return detallePedidoService.postDetallePedido(detallePedido);
    }//postDetallePedido


    @PutMapping("/{id}")
    public DetallePedido putDetallePedido(@PathVariable Long id,
                                          @RequestBody DetallePedido detallePedido) {
        return detallePedidoService.putDetallePedido(id, detallePedido);
    }//putDetallePedido


    @DeleteMapping("/{id}")
    public DetallePedido deleteDetallePedido(@PathVariable Long id) {
        return detallePedidoService.deleteDetallePedido(id);
    }//deleteDetallePedido

}//class DetallePedidoController