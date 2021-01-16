package com.camoleo.basicsocialmediaapp.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceStubImpl implements UserService {

    @Override
    public boolean authenticate(String userName, String password) {
        return Objects.equals(userName,password);
    }
}
