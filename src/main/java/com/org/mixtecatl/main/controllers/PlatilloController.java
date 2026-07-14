package com.org.mixtecatl.main.controllers;

import com.org.mixtecatl.main.models.Platillo;
import com.org.mixtecatl.main.services.PlatilloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/mixapi/platillos/")// http://localhost:8080/api/platillos/
public class PlatilloController {

    private final PlatilloService platilloService;

    @Autowired
    public PlatilloController(PlatilloService service){
        this.platilloService = service;
    }// constructor ProductoController

    @PostMapping
    public Platillo crearPlatillo(@RequestBody Platillo platillo ){
        return platilloService.crearPlatillo(platillo);
    }//crearPlatillo

    @GetMapping
    public List<Platillo> getPlatillos(){

        return platilloService.getPlatillos();
    }

    @GetMapping(path="{idPlatillo}")
    public Platillo getPlatillo(@PathVariable("idPlatillo") Long id){

        return platilloService.getPlatillo(id);
    }

    @DeleteMapping(path="{idPlatillo}")
    public Platillo deletePlatillo(@PathVariable("idPlatillo") Long id){

        return platilloService.deletePlatillo(id);
    }


    @PutMapping(path="/{idPlatillo}")// http://localhost:8080/mixapi/productos/{idPlatillo}
    public Platillo actualizarPlatillo(@PathVariable("idPlatillo") Long id,
                                       @RequestParam(value = "nombrePlatillo", required = false)String nombrePlatillo,
                                       @RequestParam(value = "categoria", required = false)String categoria,
                                       @RequestParam(value = "imagen", required = false)String imagen,
                                       @RequestParam(value = "precio", required = false)Double precio){
        return platilloService.actualizarPlatillo(id, nombrePlatillo, categoria, precio, imagen);
    }//actualizarPlatillo
}