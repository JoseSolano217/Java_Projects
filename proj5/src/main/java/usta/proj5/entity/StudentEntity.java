package usta.proj5.entity;

import com.sun.istack.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student")
public class StudentEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private Long id_student;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "first_surname")
    private String first_surname;

    @NotNull
    @Column(name = "second_surname")
    private String second_surname;

    @NotNull
    @Column(name = "document")
    private String document;

    @JoinColumn(name = "id_faculty", referencedColumnName = "id_faculty")
    @ManyToOne(fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private FacultyEntity facultyEntity;

    public Long getId_student() {
        return id_student;
    }

    public void setId_student(Long id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirst_surname() {
        return first_surname;
    }

    public void setFirst_surname(String first_surname) {
        this.first_surname = first_surname;
    }

    public String getSecond_surname() {
        return second_surname;
    }

    public void setSecond_surname(String second_surname) {
        this.second_surname = second_surname;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public FacultyEntity getFacultyEntity() {
        return facultyEntity;
    }

    public void setFacultyEntity(FacultyEntity facultyEntity) {
        this.facultyEntity = facultyEntity;
    }
}
