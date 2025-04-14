package com.example.picpay.controller;

import com.example.picpay.domain.dto.BusinessAccountRequestBodyDTO;
import com.example.picpay.domain.dto.PersonalAccountRequestBodyDTO;
import com.example.picpay.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/api/account")
public class AccountController {

    private final AccountService accountService;

    public ResponseEntity<Object> insertAccount(@RequestBody PersonalAccountRequestBodyDTO requestBody) {
        return  ResponseEntity.ok().body(accountService.insertAccount(requestBody));
    }

    public ResponseEntity<Object> insertAccount(@RequestBody BusinessAccountRequestBodyDTO requestBody) {
        return  ResponseEntity.ok().body(accountService.insertAccount(requestBody));
    }
}
