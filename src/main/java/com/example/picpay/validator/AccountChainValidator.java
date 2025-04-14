package com.example.picpay.validator;

import com.example.picpay.domain.dto.PersonalAccountRequestBodyDTO;
import com.example.picpay.domain.model.Violation;

import java.util.ArrayList;
import java.util.List;

public class AccountChainValidator {

    private final List<Violation> violations = new ArrayList<>();

    public AccountChainValidator validateName(PersonalAccountRequestBodyDTO request) {

        if(request.name().isBlank()) {
        
        }

        return this;
    }
}
