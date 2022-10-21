package usta.project1.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "faculty")
public class FacultyEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_faculty")
    private Long id_faculty;

    @NotNull
    @Column(name = "name")
    @Size(max = 200)
    private String name;

    @NotNull
    @JoinColumn(name = "id_sectional", referencedColumnName = "id_sectional")
    @ManyToOne(fetch = FetchType.EAGER)
    private SectionalEntity sectionalEntity;

    public Long getId_faculty() {
        return id_faculty;
    }

    public void setId_faculty(Long id_faculty) {
        this.id_faculty = id_faculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SectionalEntity getSectionalEntity() {
        return sectionalEntity;
    }

    public void setSectionalEntity(SectionalEntity sectionalEntity) {
        this.sectionalEntity = sectionalEntity;
    }
}
