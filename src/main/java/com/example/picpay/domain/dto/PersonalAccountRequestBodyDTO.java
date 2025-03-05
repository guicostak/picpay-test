package com.example.picpay.domain.dto;

import java.time.LocalDate;

public record PersonalAccountRequestBodyDTO(String name, String account, LocalDate bornDate, String cpf, String adress) {}
