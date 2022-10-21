package usta.project1.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "sectional")
public class SectionalEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sectional")
    private Long id_sectional;

    @NotNull
    @Column(name = "direction")
    @Size(max = 200)
    private String direction;

    @NotNull
    @Column(name = "name")
    @Size(max = 200)
    private String name;

    @NotNull
    @JoinColumn(name = "id_university", referencedColumnName = "id_university")
    @ManyToOne(fetch = FetchType.EAGER)
    private UniversityEntity id_university;

    public Long getId_sectional() {
        return id_sectional;
    }

    public void setId_sectional(Long id_sectional) {
        this.id_sectional = id_sectional;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniversityEntity getId_university() {
        return id_university;
    }

    public void setId_university(UniversityEntity id_university) {
        this.id_university = id_university;
    }
}
