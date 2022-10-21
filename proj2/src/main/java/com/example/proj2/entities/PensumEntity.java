package com.example.proj2.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "pensum")
public class PensumEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pensum")
    private Long id_pensum;

    @NotNull
    @Column(name = "name")
    @Size(max = 200)
    private String name;

    @NotNull
    @Column(name = "period")
    @Size(max = 200)
    private int period;
 
    @NotNull
    @JoinColumn(name = "id_program", referencedColumnName = "id_program")
    @ManyToOne(fetch = FetchType.EAGER)
    private ProgramEntity programEntity;

    public Long getId_pensum() {
        return id_pensum;
    }

    public void setId_pensum(Long id_pensum) {
        this.id_pensum = id_pensum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public ProgramEntity getProgramEntity() {
        return programEntity;
    }

    public void setProgramEntity(ProgramEntity programEntity) {
        this.programEntity = programEntity;
    }
}
