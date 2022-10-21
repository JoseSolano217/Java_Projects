package usta.project1.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "university")
public class UniversityEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_university")
    private Long id_university;

    @NotNull
    @Column(name = "name")
    @Size(max = 200)
    private String name;

    @NotNull
    @Column(name = "nit")
    @Size(max = 200)
    private String nit;

    @NotNull
    @Column(name = "country")
    @Size(max = 50)
    private String country;

    public Long getId_university() {
        return id_university;
    }

    public void setId_university(Long id_university) {
        this.id_university = id_university;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
