package com.org.mixtecatl.main.models;

import java.util.Date;
import java.util.List;

public class Pedido {
  private Long idCliente;
  private Long idPedido;
  private List<Long> platillos;
  private Date fecha;
  private Boolean EstadoPedido;

    public Pedido(Long idCliente, Long idPedido, List<Long> platillos, Date fecha, Boolean estadoPedido) {
        this.idCliente = idCliente;
        this.idPedido = idPedido;
        this.platillos = platillos;
        this.fecha = fecha;
        EstadoPedido = estadoPedido;
    }

    //getter
    public Long getIdCliente() {return idCliente;}
    public Long getIdPedido() {return idPedido;}
    public List<Long> getPlatillos() {return platillos;}
    public Date getFecha() {return fecha;}
    public Boolean getEstadoPedido() {return EstadoPedido;}

    //Setter


    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public void setPlatillos(List<Long> platillos) {
        this.platillos = platillos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstadoPedido(Boolean estadoPedido) {
        EstadoPedido = estadoPedido;
    }


}
