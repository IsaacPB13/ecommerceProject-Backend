package com.org.mixtecatl.main.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name="platillos")
public class Platillo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPlatillo", unique=true, nullable = false)
    private Long idPlatillo;

    @Column(name="nombrePlatillo", nullable = false)
    private String nombrePlatillo;

    @Column(name="categoria", nullable = false)
    private String categoria;

    @Column(name="precio", nullable = false)
    private Double precio;

    @Column(name="imagen", nullable = false)
    private String imagen;

    @JsonManagedReference
    @OneToOne(mappedBy = "platillos")
    private DetallePedido detallePedido;

    public Platillo(){}

    public Platillo(String nombrePlatillo, String categoria, Double precio, String imagen) {
        this.nombrePlatillo = nombrePlatillo;
        this.categoria = categoria;
        this.imagen = imagen;
        this.precio = precio;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public Long getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(Long idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Platillo{" +
                "idPlatillo=" + idPlatillo +
                ", nombrePlatillo='" + nombrePlatillo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", imagen='" + imagen + '\'' +
                ", precio=" + precio +
                '}';
    }
}