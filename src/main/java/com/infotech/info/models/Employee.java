package com.infotech.info.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private Double salary;

    @Column(nullable = false)
    private Integer sales;

    @ManyToOne
    @JoinColumn(name = "office_id", nullable = false, updatable = false)
    private Office office;

    @OneToOne
    @JoinColumn(name = "supervisor", nullable = true, updatable = false)
    private Employee employee;

    @OneToMany(mappedBy = "employee")
    private List<Purchase> purchase = new ArrayList<Purchase>();
}
