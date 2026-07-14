package com.org.mixtecatl.main.models;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name = "detallePedidos")
public class DetallePedido {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "idDetalle")
        private Long idDetalle;

        @Column(name = "cantidad", nullable = false)
        private Integer cantidad;

        @Column(name = "precioUnitario", nullable = false)
        private BigDecimal precioUnitario;

        @Column(name = "subtotal", nullable = false)
        private BigDecimal subtotal;

        @Column(name = "platillo_idPlatillo", nullable = false)
        private Long platilloIdPlatillo;

        @Column(name = "pedidos_idPedido", nullable = false)
        private Long pedidosIdPedido;



        public DetallePedido(Integer cantidad, BigDecimal precioUnitario, BigDecimal subtotal,
                             Long platilloIdPlatillo, Long pedidosIdPedido) {
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
            this.subtotal = subtotal;
            this.platilloIdPlatillo = platilloIdPlatillo;
            this.pedidosIdPedido = pedidosIdPedido;
        }//constructorDetallePedido

        public DetallePedido() {
        }//requerimiento JPA (Constructor vacío)

        public Long getIdDetalle() {
            return idDetalle;
        }//getIdDetalle

        public void setIdDetalle(Long idDetalle) {
            this.idDetalle = idDetalle;
        }//setIdDetalle

        public Integer getCantidad() {
            return cantidad;
        }//getCantidad

        public void setCantidad(Integer cantidad) {
            this.cantidad = cantidad;
        }//setCantidad

        public BigDecimal getPrecioUnitario() {
            return precioUnitario;
        }//getPrecioUnitario

        public void setPrecioUnitario(BigDecimal precioUnitario) {
            this.precioUnitario = precioUnitario;
        }//setPrecioUnitario

        public BigDecimal getSubtotal() {
            return subtotal;
        }//getSubtotal

        public void setSubtotal(BigDecimal subtotal) {
            this.subtotal = subtotal;
        }//setSubtotal

        public Long getPlatilloIdPlatillo() {
            return platilloIdPlatillo;
        }//getPlatilloIdPlatillo

        public void setPlatilloIdPlatillo(Long platilloIdPlatillo) {
            this.platilloIdPlatillo = platilloIdPlatillo;
        }//setPlatilloIdPlatillo

        public Long getPedidosIdPedido() {
            return pedidosIdPedido;
        }//getPedidosIdPedido

        public void setPedidosIdPedido(Long pedidosIdPedido) {
            this.pedidosIdPedido = pedidosIdPedido;
        }//setPedidosIdPedido

        @Override
        public String toString() {
            return "DetallePedido{" +
                    "idDetalle=" + idDetalle +
                    ", cantidad=" + cantidad +
                    ", precioUnitario=" + precioUnitario +
                    ", subtotal=" + subtotal +
                    ", platilloIdPlatillo=" + platilloIdPlatillo +
                    ", pedidosIdPedido=" + pedidosIdPedido +
                    '}';
        }//toString
}// class DetallePedido

