package com.example.picpay.service;

import com.example.picpay.domain.dto.BusinessAccountRequestBodyDTO;
import com.example.picpay.domain.dto.PersonalAccountRequestBodyDTO;
import com.example.picpay.domain.entity.BusinessAccountEntity;
import com.example.picpay.domain.entity.PersonalAccountEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AccountService {

    public PersonalAccountEntity insertAccount(PersonalAccountRequestBodyDTO requestBodyDTO) {
        return PersonalAccountEntity.builder().build();
    }

    public BusinessAccountEntity insertAccount(BusinessAccountRequestBodyDTO requestBodyDTO) {
        return BusinessAccountEntity.builder().build();
    }
}
