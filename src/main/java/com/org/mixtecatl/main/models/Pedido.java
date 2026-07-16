package com.org.mixtecatl.main.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

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

    @JsonManagedReference
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<DetallePedido> detalles;

    @JsonBackReference
    @ManyToOne //relacion uno a muchos invertida
    @JoinColumn(name="idUsuario") //referencia de la FK
    private Usuario usuario;

    public Pedido(Date fechaSolicitud, String estadoPedido) {
        this.fechaSolicitud = fechaSolicitud;
        this.estadoPedido = estadoPedido;
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

    public List<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetallePedido> detalles) {
        this.detalles = detalles;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", fechaSolicitud=" + fechaSolicitud +
                ", estadoPedido='" + estadoPedido + '\'' +
                ", detallePedido=" + detalles +
                ", usuario=" + usuario +
                '}';
    }
}//class Pedido

