package usta.proj5.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "students_subjects")
public class StudentsSubjectsEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_students_subjects")
    private Long id_students_subjects;

    @JoinColumn(name = "id_student", referencedColumnName = "id_student")
    @ManyToOne(fetch = FetchType.EAGER)
    private StudentEntity studentEntity;

    @JoinColumn(name = "id_subject", referencedColumnName = "id_subject")
    @ManyToOne(fetch = FetchType.EAGER)
    private SubjectEntity subjectEntity;

    public Long getId_students_subjects() {
        return id_students_subjects;
    }

    public void setId_students_subjects(Long id_students_subjects) {
        this.id_students_subjects = id_students_subjects;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public SubjectEntity getSubjectEntity() {
        return subjectEntity;
    }

    public void setSubjectEntity(SubjectEntity subjectEntity) {
        this.subjectEntity = subjectEntity;
    }
}
