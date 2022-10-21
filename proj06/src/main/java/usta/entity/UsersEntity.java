package usta.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class UsersEntity implements Serializable {
    private static final long  serialVersionUID =1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id_user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient", referencedColumnName = "id_user")
    private PatientsEntity patient;
}
