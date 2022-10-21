package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pagos")
public class PagosEntity implements Serializable {

    private static final long  serialVersionUID =1;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpago")
    private Long idpago;

    @NotNull
    @Column(name = "tipoPago")
    private String tipoPago;

    public Long getIdpago() {
        return idpago;
    }

    public void setIdpago(Long idpago) {
        this.idpago = idpago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
}
