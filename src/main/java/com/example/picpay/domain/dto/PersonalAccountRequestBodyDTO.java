package com.example.picpay.domain.dto;

import com.example.picpay.domain.entity.AdressEntity;

import java.time.LocalDate;

public record PersonalAccountRequestBodyDTO(String name, String accountNumber, LocalDate bornDate, String cpf,
                                            AdressEntity adress) {}
