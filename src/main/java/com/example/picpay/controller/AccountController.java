package com.example.picpay.controller;


import com.example.picpay.domain.dto.PersonalAccountRequestBodyDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/account")
public class AccountController {

    public ResponseEntity<?> insertAccount(@RequestBody PersonalAccountRequestBodyDTO requestBody) {

    }
}
