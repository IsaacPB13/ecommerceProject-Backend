package com.org.mixtecatl.main.models;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table (name= "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPedido")
    private Long idPedido;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fechaSolicitud",nullable = false)
    private Date fechaSolicitud;

    @Column(name = "estadoPedido",nullable = false)
    private String estadoPedido;

    @Column(name = "usuario_idUsuario", nullable = false)
    private Long usuario;

    public Pedido(Date fechaSolicitud, String estadoPedido, Long usuario) {
        this.fechaSolicitud = fechaSolicitud;
        this.estadoPedido = estadoPedido;
        this.usuario = usuario;
    }//constructorPedido

    public Pedido(){}//requerimento JPA (Constuctor Vacio)

    public Long getIdPedido() {
        return idPedido;
    }//getIdPedido

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }//setIdPedido

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }//get FechaSolicitud

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }//setFechaSolicitud

    public String getEstadoPedido() {
        return estadoPedido;
    }//getEstadoPedido

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }//setEstadoPedido

    public Long getUsuario() {
        return usuario;
    }//getUsuario

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }//setUsuario

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", fechaSolicitud=" + fechaSolicitud +
                ", estadoPedido='" + estadoPedido + '\'' +
                ", usuario=" + usuario +
                '}';
    }//toString
}//class Pedido

