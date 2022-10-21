package com.example.deeprecorder.entity;

import lombok.Data;

import javax.persistence.*;
import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "enterprise")
public class Enterprise implements Serializable {
    @Id
    @Column(name = "id_enterprise", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEnterprise;

    @Column(name = "rut")
    private String rut;

    @Column(name = "name")
    private String name;

    @Column(name = "adress")
    private String adress;

    public long getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(long idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
