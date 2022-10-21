package com.example.proj2.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "semester")
public class SemesterEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_semester")
    private Long id_semester;

    @NotNull
    @Column(name = "name")
    @Size(max = 200)
    private String name;

    public Long getId_semester() {
        return id_semester;
    }

    public void setId_semester(Long id_semester) {
        this.id_semester = id_semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
