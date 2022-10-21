package com.example.demo.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "pacientes")
public class PacientesEntity implements Serializable {

    private static final long  serialVersionUID =1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpaciente")
    private Long idpaciente;

    @NotNull
    @Column(name = "nombres")
    private String nombres;

    @NotNull
    @Column(name = "primerApellido")
    private String primerApellido;

    @NotNull
    @Column(name = "segundoApellido")
    private String segundoApellido;

    @NotNull
    @Column(name = "documento",unique = true)
    private String documento;

    @NotNull
    @Column(name = "fechanacimiento")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;

    @NotNull
    @Column(name = "medicamentos")
    private String medicamentos;

    @NotNull
    @Column(name = "alergias")
    private String alergias;


    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_usuario")
    private UsuariosEntity usuario;

    public Long getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Long idpaciente) {
        this.idpaciente = idpaciente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public UsuariosEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuariosEntity usuario) {
        this.usuario = usuario;
    }
}
