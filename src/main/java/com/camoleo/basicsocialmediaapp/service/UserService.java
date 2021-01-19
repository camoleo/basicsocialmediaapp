package com.camoleo.basicsocialmediaapp.service;

import com.camoleo.basicsocialmediaapp.model.User;

import java.util.List;

public interface UserService {
    boolean authenticate(String userName, String password);
    boolean hasUser(String username);
    void create(String username, String password);
    User create(User user);
    List<User> findAll();
    User findById(Long id);
    User edit(User user);
    void deleteById(Long id);
}
