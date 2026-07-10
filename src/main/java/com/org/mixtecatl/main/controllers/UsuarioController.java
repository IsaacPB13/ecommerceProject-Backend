package com.org.mixtecatl.main.controllers;

import com.org.mixtecatl.main.models.Usuario;
import com.org.mixtecatl.main.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/usuarios/")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService service){
        this.usuarioService = service;
    }// Constructor UsuarioController

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario){

        return usuarioService.crearUsuario(usuario);

    }// crearUsuario

}// Class UsuarioController