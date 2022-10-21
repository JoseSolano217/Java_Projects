package usta.project1.model;

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
    @Column(name = "semester")
    private int semester;

    @NotNull
    @Column(name = "name")
    @Size(max = 200)
    private String name;

    @NotNull
    @Column(name = "code")
    private int code;

    @NotNull
    @Column(name = "type")
    @Size(max = 200)
    private String type;

    @NotNull
    @JoinColumn(name = "id_professor", referencedColumnName = "id_professor")
    @ManyToOne(fetch = FetchType.EAGER)
    private ProfessorEntity professorEntity;

    public Long getId_assignature() {
        return id_assignature;
    }

    public void setId_assignature(Long id_assignature) {
        this.id_assignature = id_assignature;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProfessorEntity getProfessorEntity() {
        return professorEntity;
    }

    public void setProfessorEntity(ProfessorEntity professorEntity) {
        this.professorEntity = professorEntity;
    }
}
