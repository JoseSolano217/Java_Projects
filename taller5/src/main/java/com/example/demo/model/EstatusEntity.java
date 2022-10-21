package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "estatus")
public class EstatusEntity implements Serializable {

    private static final long  serialVersionUID =1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idestatus")
    private Long idestatus;

    @NotNull
    @Column(name = "nombreEstatus")
    private Integer nombreEstatus;

    public Long getIdestatus() {
        return idestatus;
    }

    public void setIdestatus(Long idestatus) {
        this.idestatus = idestatus;
    }

    public Integer getNombreEstatus() {
        return nombreEstatus;
    }

    public void setNombreEstatus(Integer nombreEstatus) {
        this.nombreEstatus = nombreEstatus;
    }
}
