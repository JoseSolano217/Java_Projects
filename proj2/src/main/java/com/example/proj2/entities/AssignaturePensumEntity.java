package com.example.proj2.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "assignature_pensum")
public class AssignaturePensumEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_assignature_pensum")
    private Long id_assignature_pensum;

    @NotNull
    @JoinColumn(name = "id_semester", referencedColumnName = "id_semester")
    @ManyToOne(fetch = FetchType.EAGER)
    private SemesterEntity semesterEntity;

    @NotNull
    @JoinColumn(name = "id_pensum", referencedColumnName = "id_pensum")
    @ManyToOne(fetch = FetchType.EAGER)
    private PensumEntity pensumEntity;

    @NotNull
    @JoinColumn(name = "id_assignature", referencedColumnName = "id_assignature")
    @ManyToOne(fetch = FetchType.EAGER)
    private AssignatureEntity assignatureEntity;

    public Long getId_assignature_pensum() {
        return id_assignature_pensum;
    }

    public void setId_assignature_pensum(Long id_semester) {
        this.id_assignature_pensum = id_semester;
    }

    public SemesterEntity getSemesterEntity() {
        return semesterEntity;
    }

    public void setSemesterEntity(SemesterEntity semesterEntity) {
        this.semesterEntity = semesterEntity;
    }

    public PensumEntity getPensumEntity() {
        return pensumEntity;
    }

    public void setPensumEntity(PensumEntity pensumEntity) {
        this.pensumEntity = pensumEntity;
    }

    public AssignatureEntity getAssignatureEntity() {
        return assignatureEntity;
    }

    public void setAssignatureEntity(AssignatureEntity assignatureEntity) {
        this.assignatureEntity = assignatureEntity;
    }
}
