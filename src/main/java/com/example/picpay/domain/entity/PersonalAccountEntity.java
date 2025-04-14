package com.example.picpay.domain.entity;

import jakarta.persistence.Entity;
import lombok.Builder;

import java.time.LocalDate;

@Builder
@Entity(name = "tb_personal_account")
public class PersonalAccountEntity extends BankAccountEntity {

    private String name;
    private LocalDate bornDate;
    private String cpf;
}
