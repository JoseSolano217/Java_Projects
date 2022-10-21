package usta.proj05.models;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "document")
public class DocumentEntity implements Serializable {
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_document")
    private Long id_document;

    @Column(name = "type_document")
    private Integer type_document;

    @NotNull
    @Column(name = "document_number", unique = true)
    private String document_number;

    @NotNull
    @Column(name = "get_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date get_date;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_partner", referencedColumnName = "id_partner")
    private PartnerEntity partner;

    public Long getId_document() {
        return id_document;
    }

    public void setId_document(Long id_document) {
        this.id_document = id_document;
    }

    public Integer getType_document() {
        return type_document;
    }

    public void setType_document(Integer type_document) {
        this.type_document = type_document;
    }

    public String getDocument_number() {
        return document_number;
    }

    public void setDocument_number(String document_number) {
        this.document_number = document_number;
    }

    public Date getGet_date() {
        return get_date;
    }

    public void setGet_date(Date get_date) {
        this.get_date = get_date;
    }

    public PartnerEntity getPartner() {
        return partner;
    }

    public void setPartner(PartnerEntity partner) {
        this.partner = partner;
    }
}
