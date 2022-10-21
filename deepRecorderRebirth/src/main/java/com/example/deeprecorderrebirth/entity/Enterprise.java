package com.example.deeprecorderrebirth.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "enterprise")
@Data
public class Enterprise implements Serializable {
    @Id
    @Column(name = "id_enterprise", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEnterprise;

    @NotNull
    @Column(name = "nameenterprise")
    private String nameenterprise;

    @NotNull
    @Column(name = "rut")
    private String rut;

    @NotNull
    @Column(name = "adress")
    private LocalDateTime adress;
}
