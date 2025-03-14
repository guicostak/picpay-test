package com.example.picpay.domain.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class Error {
    private String title;
    private String detail;
    private List<Violation> violations = new ArrayList<>();
    private HttpStatus httpStatus;
}
