package com.example.picpay.validator;

import com.example.picpay.domain.dto.PersonalAccountRequestBodyDTO;
import com.example.picpay.domain.model.Violation;

import java.util.ArrayList;
import java.util.List;

public class PersonalAccountChainValidator {

    private final List<Violation> violations = new ArrayList<>();

    public PersonalAccountChainValidator validateName(PersonalAccountRequestBodyDTO request) {

        if(request.name().isBlank()) {
            violations.add(Violation.builder()
                            .property("name")
                            .violation("The name field cannot be empty")
                    .build());
        } else if(request.name().length() < 3) {
            violations.add(Violation.builder()
                            .property("name")
                            .violation("The name field must be at least 3 characterers")
                    .build());
        }

        return this;
    }

    public List<Violation> build(){
        return this.violations;
    };
}
