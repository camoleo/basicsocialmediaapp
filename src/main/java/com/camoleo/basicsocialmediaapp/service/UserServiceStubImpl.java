package com.camoleo.basicsocialmediaapp.service;

import com.camoleo.basicsocialmediaapp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceStubImpl implements UserService {

    @Override
    public boolean authenticate(String userName, String password) {
        return Objects.equals(userName,password);
    }

    @Override
    public boolean hasUser(String username) {
        return false;
    }

    @Override
    public void create(String username, String password) {

    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public User edit(User user) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
