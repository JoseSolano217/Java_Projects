package com.example.crudservices.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "enterprise")
public class EnterpriseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enterprise")
    private Long idEnterprise;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "nit")
    private String nit;

    @NotNull
    @Column(name = "code")
    private int code;

    public Long getIdEnterprise() {
        return idEnterprise;
    }

    public void setIdEnterprise(Long idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
