package usta.project1.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "professor")
public class ProfessorEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_professor")
    private Long id_professor;

    @NotNull
    @Column(name = "document")
    @Size(max = 200)
    private String document;

    @NotNull
    @Column(name = "names")
    @Size(max = 200)
    private String names;

    @NotNull
    @Column(name = "surnames")
    @Size(max = 200)
    private String surnames;

    @NotNull
    @Column(name = "type")
    private int type;

    @NotNull
    @JoinColumn(name = "id_faculty", referencedColumnName = "id_faculty")
    @ManyToOne(fetch = FetchType.EAGER)
    private FacultyEntity facultyEntity;

    public Long getId_professor() {
        return id_professor;
    }

    public void setId_professor(Long id_professor) {
        this.id_professor = id_professor;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public FacultyEntity getFacultyEntity() {
        return facultyEntity;
    }

    public void setFacultyEntity(FacultyEntity facultyEntity) {
        this.facultyEntity = facultyEntity;
    }
}
