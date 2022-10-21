package com.example.demo.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.Reference;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "citas")
public class CitasEntity implements Serializable {

    private static final long  serialVersionUID =1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcita")
    private Long idcita;

    @NotNull
    @Column(name = "titulo")
    private String titulo;

    @NotNull
    @Column(name = "nota")
    private String nota;

    @NotNull
    @Column(name = "fecha_cita")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fecha_cita;

    @NotNull
    @Column(name = "sintomas")
    private String sintomas;

    @NotNull
    @Column(name = "medicamentos")
    private String medicamentos;

    @NotNull
    @Column(name = "tipocita")
    private Integer tipocita;

    @NotNull
    @Column(name = "antecedentes")
    private boolean antecedentes;

    @JoinColumn(name = "id_medico",referencedColumnName = "idmedico")
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private MedicosEntity medicosEntity;


    @JoinColumn(name = "id_pago",referencedColumnName = "idpago")
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private PagosEntity pagosEntity;

    @JoinColumn(name = "id_estatus",referencedColumnName = "idestatus")
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private EstatusEntity estatusEntity;

    public Long getIdcita() {
        return idcita;
    }

    public void setIdcita(Long idcita) {
        this.idcita = idcita;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Date getFecha_cita() {
        return fecha_cita;
    }

    public void setFecha_cita(Date fecha_cita) {
        this.fecha_cita = fecha_cita;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Integer getTipocita() {
        return tipocita;
    }

    public void setTipocita(Integer tipocita) {
        this.tipocita = tipocita;
    }

    public boolean isAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(boolean antecedentes) {
        this.antecedentes = antecedentes;
    }

    public MedicosEntity getMedicosEntity() {
        return medicosEntity;
    }

    public void setMedicosEntity(MedicosEntity medicosEntity) {
        this.medicosEntity = medicosEntity;
    }

    public PagosEntity getPagosEntity() {
        return pagosEntity;
    }

    public void setPagosEntity(PagosEntity pagosEntity) {
        this.pagosEntity = pagosEntity;
    }

    public EstatusEntity getEstatusEntity() {
        return estatusEntity;
    }

    public void setEstatusEntity(EstatusEntity estatusEntity) {
        this.estatusEntity = estatusEntity;
    }
}
