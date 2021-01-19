//package com.camoleo.basicsocialmediaapp.controller;
//
//import com.camoleo.basicsocialmediaapp.exeptions.UserNotFoundException;
//import com.camoleo.basicsocialmediaapp.repo.UserRepository;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @GetMapping
//    public Iterable findAll(){
//        return userRepository.findAll();
//    }
//
//    @GetMapping("/username/{userName}")
//    public List findByUsername(@PathVariable String userName){
//        return userRepository.findByUsername(userName);
//    }
//    @GetMapping("/{id}")
//    public User findOne(@PathVariable Long id) {
//        return userRepository.findById(id)
//                .orElseThrow(UserNotFoundException::new);
//    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public User viewPosts(@RequestBody User user) {
//        return userRepository.save(user);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable Long id) {
//        userRepository.findById(id)
//                .orElseThrow(UserNotFoundException::new);
//        userRepository.deleteById(id);
//    }
//
//    @PutMapping("/{id}")
//    public User updateUser(@RequestBody User user, @PathVariable Long id) {
//        if (user.getId() != id) {
//            throw new BookIdMismatchException();
//        }
//        userRepository.findById(id)
//                .orElseThrow(UserNotFoundException::new);
//        return userRepository.save(user);
//    }
//}
