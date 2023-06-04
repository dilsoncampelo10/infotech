package com.infotech.info.models;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    @UniqueElements
    private String cpf;

    @Column(nullable = false)
    private Integer score;

    @ManyToOne
    @JoinColumn(name = "address_id", updatable = false, nullable = false)
    private Address address;

    @OneToMany(mappedBy = "client")
    private List<Phone> phone = new ArrayList<Phone>();

    @OneToMany(mappedBy = "client")
    private List<Purchase> purchase = new ArrayList<Purchase>();
}
