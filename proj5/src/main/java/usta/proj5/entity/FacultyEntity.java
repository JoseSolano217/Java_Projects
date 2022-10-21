package usta.proj5.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
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
    private String name;

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
}