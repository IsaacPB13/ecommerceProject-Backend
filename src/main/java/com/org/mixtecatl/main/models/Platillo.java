package com.org.mixtecatl.main.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="Platillo")
public class Platillo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPlatillo", unique=true, nullable = false)
    private Long IdPlatillo;



    @Column(name="Nombre_platillo", nullable = false)
    private String Nombre_platillo;

    @Column(name="Categoria", nullable = false)
    private String Categoria;

    @Column(name="Imagen", nullable = false)
    private String Imagen;

    @Column(name="Precio", nullable = false)
    private Double Precio;


    public Platillo(){}

    public String getNombre_platillo() {
        return Nombre_platillo;
    }

    public void setNombre_platillo(String nombre_platillo) {
        Nombre_platillo = nombre_platillo;
    }

    public Long getIdPlatillo() {
        return IdPlatillo;
    }

    public void setIdPlatillo(Long IdPlatillo) {
        this.IdPlatillo = IdPlatillo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }


    public Platillo(String Nombre_platillo, String Categoria, String Imagen, Double Precio) {
        this.Nombre_platillo = Nombre_platillo;
        this.Categoria = Categoria;
        this.Imagen = Imagen;
        this.Precio = Precio;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Platillo{" +
                "IdPlatillo=" + IdPlatillo +
                ", Nombre_platillo='" + Nombre_platillo + '\'' +
                ", Categoria='" + Categoria + '\'' +
                ", Imagen='" + Imagen + '\'' +
                ", Precio=" + Precio +
                '}';
    }
}