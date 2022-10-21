package com.example.proj2.entities;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "program")
public class ProgramEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_program")
    private Long id_program;

    @NotNull
    @Column(name = "name")
    @Size(max = 200)
    private String name;

    public Long getId_program() {
        return id_program;
    }

    public void setId_program(Long id_program) {
        this.id_program = id_program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
