package com.camoleo.basicsocialmediaapp.service;

import com.camoleo.basicsocialmediaapp.model.User;
import com.camoleo.basicsocialmediaapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceJpaImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//    @Override
//    public boolean authenticate(String username, String password) {
//        return this.userRepository.exists(username,password);
//    }

    @Override
    public boolean authenticate(String username, String password) {
        return false;
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
        return this.userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return this.userRepository.getOne(id);
    }

    @Override
    public User edit(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public void deleteById(Long id) {
this.userRepository.deleteById(id);
    }
}
