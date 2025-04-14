package com.example.picpay.domain.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

import lombok.Data;

import java.util.UUID;

@Data
@Entity(name = "tb_account")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BankAccountEntity {

    @Id
    @GeneratedValue
    private UUID id;

    private String accountNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adress_id")
    private AdressEntity adressEntity;

    private double bankBalance;
}
