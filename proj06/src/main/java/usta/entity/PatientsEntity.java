package usta.entity;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "patients")
public class PatientsEntity implements Serializable {
    private static final long  serialVersionUID =1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private Long id_patient;

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
    @Column(name = "document", unique = true)
    private String document;

    @NotNull
    @Column(name = "birthdate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date birthdate;

    @NotNull
    @Column(name = "medicine")
    private String medicine;

    @NotNull
    @Column(name = "allergies")
    private String allergies;

    @OneToOne(mappedBy = "user")
    private UsersEntity user;
}
