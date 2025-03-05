package com.example.picpay.domain.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public abstract class BankAccount {
    private String account;
    private String adress;
}
