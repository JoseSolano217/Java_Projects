package com.example.deeprecorderrebirth.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "bill")

public class Bill implements Serializable {
    @Id
    @Column(name = "bill_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bill_id;

    @NotNull
    @Column(name = "product_type")
    private String product_type;

    @NotNull
    @Column(name = "taxes")
    private Integer taxes;

    @JoinColumn(name = "enterprise_enterprise_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Enterprise enterprise_enterprise_id;

    @JoinColumn(name = "client_client_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private Client client_client_id;

    @JoinColumn(name = "product_product_id",nullable = false)
    @OneToMany( fetch = FetchType.LAZY)
    private List<Product> product_product_id;

    public Long getBill_id() {
        return bill_id;
    }

    public void setBill_id(Long bill_id) {
        this.bill_id = bill_id;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public Integer getTaxes() {
        return taxes;
    }

    public void setTaxes(Integer taxes) {
        this.taxes = taxes;
    }

    public Enterprise getEnterprise_enterprise_id() {
        return enterprise_enterprise_id;
    }

    public void setEnterprise_enterprise_id(Enterprise enterprise_enterprise_id) {
        this.enterprise_enterprise_id = enterprise_enterprise_id;
    }

    public Client getClient_client_id() {
        return client_client_id;
    }

    public void setClient_client_id(Client client_client_id) {
        this.client_client_id = client_client_id;
    }

    public List<Product> getProduct_product_id() {
        return product_product_id;
    }

    public void setProduct_product_id(List<Product> product_product_id) {
        this.product_product_id = product_product_id;
    }
}
