package com.example.service;

import org.springframework.stereotype.Service;

@Service("AccountService")
public class DatabaseAccountService implements AccountService {

    @Override
    public String sout() {
        return "database";
    }
}