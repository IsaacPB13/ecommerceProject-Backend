package com.org.mixtecatl.main.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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

        @JsonBackReference
        @ManyToOne
        @JoinColumn(name="idPlatillo") //referencia de la FK
        private Platillo platillo;

        @JsonBackReference
        @ManyToOne
        @JoinColumn(name="idPedido") //referencia de la FK
        private Pedido pedido;

        public DetallePedido(Integer cantidad, BigDecimal precioUnitario, BigDecimal subtotal) {
            this.cantidad = cantidad;
            this.precioUnitario = precioUnitario;
            this.subtotal = subtotal;
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

        public Platillo getPlatillo() {
            return platillo;
        }

        public Pedido getPedido() {
            return pedido;
        }


        public void setPlatillo(Platillo platillo) {
            this.platillo = platillo;
        }

        public void setPedido(Pedido pedido) {
            this.pedido = pedido;
        }

        @Override
        public String toString() {
            return "DetallePedido{" +
                    "idDetalle=" + idDetalle +
                    ", cantidad=" + cantidad +
                    ", precioUnitario=" + precioUnitario +
                    ", subtotal=" + subtotal +
                    ", platillo=" + platillo +
                    ", pedido=" + pedido +
                    '}';
    }
}// class DetallePedido

