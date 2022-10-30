package com.ramana.accounts.controller;

import com.ramana.accounts.model.Account;
import com.ramana.accounts.model.Customer;
import com.ramana.accounts.repositories.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountRepository repository;

    @GetMapping("/myAccount/{customer_id}")
    public ResponseEntity<Account> getAccountDetails(@PathVariable("customer_id") Long customer_id){
        LOGGER.info("Inside AccountController - getAccountDetails() - request{} ", customer_id);
        Account account = repository.findByCustomerId(customer_id);
        LOGGER.info("Response: {}", account);
        return ResponseEntity.ok(account);
    }
}
