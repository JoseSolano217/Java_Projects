package com.example.deeprecorderrebirth.entity;
import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "client")
    public class Client implements Serializable {

        @Id
        @Column(name = "client_id")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long client_id;

        @NotNull
        @Column(name = "client_name")
        private String client_name;

        @NotNull
        @Column(name = "gender")
        private String gender;


        @Column(name = "birth")
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        @Temporal(TemporalType.TIMESTAMP)
        private Date birth;

        @NotNull
        @Column(name = "client_pasword")
        private String client_password;

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getClient_password() {
        return client_password;
    }

    public void setClient_password(String client_password) {
        this.client_password = client_password;
    }
}
