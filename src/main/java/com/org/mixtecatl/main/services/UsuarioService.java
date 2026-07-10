package com.org.mixtecatl.main.services;

import com.org.mixtecatl.main.models.Usuario;
import com.org.mixtecatl.main.respositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository repository){
        this.usuarioRepository = repository;
    }// Constructor UsuarioService

    public Usuario crearUsuario(Usuario usuario){

        return usuarioRepository.save(usuario);

    }// crearUsuario

}// Class UsuarioService
