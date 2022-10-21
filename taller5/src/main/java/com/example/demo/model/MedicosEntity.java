package com.example.demo.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "medicos")
public class MedicosEntity implements Serializable {

    private static final long  serialVersionUID =1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmedico")
    private Long idmedico;

    @NotNull
    @Column(name = "nombres")
    private String nombres;

    @NotNull
    @Column(name = "primerApellido")
    private String primerApellido;

    @NotNull
    @Column(name = "segundoApellido")
    private String segundoApellido;

    @NotNull
    @Column(name = "genero")
    private Integer genero;

    @NotNull
    @Column(name = "email")
    private String email;

    @NotNull
    @Column(name = "telefono")
    private String telefono;

    @JoinColumn(name = "id_categoria", referencedColumnName = "idcategoria")
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @OnDelete( action = OnDeleteAction.CASCADE)
    private CategoriasEntity categoriasEntity;

    public Long getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(Long idmedico) {
        this.idmedico = idmedico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public CategoriasEntity getCategoriasEntity() {
        return categoriasEntity;
    }

    public void setCategoriasEntity(CategoriasEntity categoriasEntity) {
        this.categoriasEntity = categoriasEntity;
    }
}
