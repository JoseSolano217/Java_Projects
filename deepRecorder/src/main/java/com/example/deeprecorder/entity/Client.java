package com.example.deeprecorder.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @Column(name = "id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idClient;

    @Column(name = "nameclient")
    private String nameclient;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "birth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birth;

    @Column(name = "passwordclient")
    private String passwordclient;

    public long getIdClient() {
        return idClient;
    }

    public void setIdClient(long idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return nameclient;
    }

    public void setName(String name) {
        this.nameclient = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getPassword() {
        return passwordclient;
    }

    public void setPassword(String password) {
        this.passwordclient = password;
    }
}
