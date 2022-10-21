package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "categorias")
public class CategoriasEntity implements Serializable {

    private static final long  serialVersionUID =1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategoria")
    private Long idcategoria;

    @NotNull
    @Column(name = "nombrecategoria")
    private String nombrecategoria;

    public Long getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Long idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombrecategoria() {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria) {
        this.nombrecategoria = nombrecategoria;
    }
}
