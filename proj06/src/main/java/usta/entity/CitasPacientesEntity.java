package usta.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "citasPacientes")
public class CitasPacientesEntity implements Serializable {

    private static final long  serialVersionUID =1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcitasPacientes")
    private Long idcitasPacientes;

    @JoinColumn(name = "id_citas",referencedColumnName = "idcita")
    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.REMOVE)
    private CitasEntity citasEntity;

    @JoinColumn(name = "id_paciente",referencedColumnName = "idpaciente")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private PacientesEntity pacientesEntity;


    public Long getIdcitasPacientes() {
        return idcitasPacientes;
    }

    public void setIdcitasPacientes(Long idcitasPacientes) {
        this.idcitasPacientes = idcitasPacientes;
    }

    public CitasEntity getCitasEntity() {
        return citasEntity;
    }

    public void setCitasEntity(CitasEntity citasEntity) {
        this.citasEntity = citasEntity;
    }

    public PacientesEntity getPacientesEntity() {
        return pacientesEntity;
    }

    public void setPacientesEntity(PacientesEntity pacientesEntity) {
        this.pacientesEntity = pacientesEntity;
    }
}
