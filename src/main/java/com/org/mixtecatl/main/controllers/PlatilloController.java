package com.org.mixtecatl.main.controllers;

import com.org.mixtecatl.main.models.Platillo;
import com.org.mixtecatl.main.services.PlatilloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/platillos/")// http://localhost:8080/api/platillos/
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

    @GetMapping(path="{productoId}")
    public Platillo getPlatillo(@PathVariable("IdPlatillo") Long id){

        return platilloService.getPlatillo(id);
    }

    @DeleteMapping(path="{productoId}")
    public Platillo deletePlatillo(@PathVariable("IdPlatillo") Long id){

        return platilloService.deletePlatillo(id);
    }


    @PutMapping(path="/{IdPlatillo}")// http://localhost:8080/api/productos/{IdPlatillo}
    public Platillo actualizarPlatillo(@PathVariable("IdPlatillo") Long id,
                                       @RequestParam(value = "Nombre_platillo", required = false)String Nombre_platillo,
                                       @RequestParam(value = "Categoria", required = false)String Categoria,
                                       @RequestParam(value = "imagen", required = false)String imagen,
                                       @RequestParam(value = "precio", required = false)Double precio){
        return platilloService.actualizarPlatillo(id, Nombre_platillo, Categoria, imagen, precio);
    }//actualizarPlatillo
}