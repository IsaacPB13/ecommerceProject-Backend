package com.org.mixtecatl.main.services;

import com.org.mixtecatl.main.models.Platillo;
import com.org.mixtecatl.main.respositories.PlatilloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlatilloService {

    private final PlatilloRepository platilloRepository;

    @Autowired
    public PlatilloService(PlatilloRepository repository){
        this.platilloRepository = repository;
    }

    public List<Platillo> getPlatillos(){
        return platilloRepository.findAll();
    }

    public Platillo crearPlatillo(Platillo platillo) {
        return platilloRepository.save(platillo);
    }//crearPlatillo

    public Platillo actualizarPlatillo(Long idPlatillo, String Nombre_Platillo, String Categoria, String imagen, Double precio) {
        Platillo platillo = null;

        if( platilloRepository.existsById(idPlatillo) ){
            platillo = platilloRepository.findById(idPlatillo).get();

            if(Nombre_Platillo != null) platillo.setNombrePlatillo(Nombre_Platillo);
            if(Categoria != null) platillo.setCategoria(Categoria);
            if(imagen != null) platillo.setImagen(imagen);
            if(precio != null) platillo.setPrecio(precio);

            platilloRepository.save(platillo);
        }
        return platillo;
    }//actualizarPlatillo

    public Platillo getPlatillo(Long id) {

        return platilloRepository.findById(id).
                orElseThrow( () -> new IllegalArgumentException("El platillo con el id ["+id+"] no existe") );
    }

    public Platillo deletePlatillo(Long id) {

        Platillo platillo = null;
        if(platilloRepository.existsById(id)){

            platillo = platilloRepository.findById(id).get();
            platilloRepository.deleteById(id);
        }

        return platillo;
    }
}