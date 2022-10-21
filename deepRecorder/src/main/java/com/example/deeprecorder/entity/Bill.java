package com.example.deeprecorder.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
public class Bill {
    @Id
    @Column(name = "id_bill", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBill;

    @Column(name = "type")
    private String type;

    @Column(name = "taxes")
    private String taxes;

    @JoinColumn(name = "FK_bill_client", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    @JoinColumn(name = "FK_bill_product",nullable = false)
    @OneToMany(fetch = FetchType.LAZY)
    private List<Product> products;

    @JoinColumn(name = "FK_bill_enterprise",nullable = false)
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Enterprise enterprises;

    public long getIdBill() {
        return idBill;
    }

    public void setIdBill(long idBill) {
        this.idBill = idBill;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaxes() {
        return taxes;
    }

    public void setTaxes(String taxes) {
        this.taxes = taxes;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Enterprise getEnterprises() {
        return enterprises;
    }

    public void setEnterprises(Enterprise enterprises) {
        this.enterprises = enterprises;
    }
}
