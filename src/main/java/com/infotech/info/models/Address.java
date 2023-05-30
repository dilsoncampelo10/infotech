package com.infotech.info.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "adresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "zip_code", nullable = false)
    @NotBlank
    private String zipCode;

    @Column(nullable = false)
    @NotBlank
    private String street;

    @Column(name = "public_place", nullable = true)
    private String publicPlace;

    @Column(nullable = true)
    private String number;

    @Column(nullable = true)
    private String complement;
}
