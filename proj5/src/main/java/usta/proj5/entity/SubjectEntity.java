package usta.proj5.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class SubjectEntity {
    private final static long serialVersionUID = 1L;

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_subject")
    private Long id_subject;

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "code")
    private int code;

    @NotNull
    @Column(name = "semester")
    private int semester;

    public Long getId_subject() {
        return id_subject;
    }

    public void setId_subject(Long id_subject) {
        this.id_subject = id_subject;
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

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
