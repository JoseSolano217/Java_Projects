package com.example.proj2.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "assignature")
public class AssignatureEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assignature")
    private Long id_assignature;

    @NotNull
    @Column(name = "name")
    @Size(max = 200)
    private String name;

    @NotNull
    @Column(name = "reference")
    @Size(max = 200)
    private String reference;

    public Long getId_semester() {
        return id_assignature;
    }

    public void setId_semester(Long id_semester) {
        this.id_assignature = id_semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
