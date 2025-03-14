package com.example.picpay.domain.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Violation {
    private String property;
    private String violation;
}
