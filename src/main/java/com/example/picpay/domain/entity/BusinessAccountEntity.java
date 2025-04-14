package com.example.picpay.domain.entity;

import com.example.picpay.domain.enums.BusinessCategoryEnum;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Entity(name = "tb_business_account")
public class BusinessAccountEntity extends BankAccountEntity {

    private String businessName;
    private String cnpj;
    private BusinessCategoryEnum businessCategory;
}
