package com.example.crudservices.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "person")
public class PersonEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Long idPerson;

    @NotNull
    @Column(name = "names")
    private String names;

    @NotNull
    @Column(name = "surnames")
    private String surnames;

    @NotNull
    @Column(name = "document")
    private String document;

    @JoinColumn(name = "id_enterprise", referencedColumnName = "id_enterprise")
    @ManyToOne(fetch = FetchType.EAGER)
    private EnterpriseEntity enterpriseEntity;

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public EnterpriseEntity getEnterpriseEntity() {
        return enterpriseEntity;
    }

    public void setEnterpriseEntity(EnterpriseEntity enterpriseEntity) {
        this.enterpriseEntity = enterpriseEntity;
    }
}
