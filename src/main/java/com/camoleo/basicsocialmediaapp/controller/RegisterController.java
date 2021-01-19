package com.camoleo.basicsocialmediaapp.controller;

import com.camoleo.basicsocialmediaapp.model.RegisterForm;
import com.camoleo.basicsocialmediaapp.service.NotificationService;
import com.camoleo.basicsocialmediaapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notificationService;

    @RequestMapping("users/register")
    public String register(RegisterForm registerForm) {
        return "users/register";
    }

    @RequestMapping(value = "users/register", method = RequestMethod.POST)
    public String registerPage(@Valid RegisterForm registerForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            notificationService.addErrorMessage("Please fill form correctly!");
            return "users/register";
        }
        if (userService.hasUser(registerForm.getUserName())) {
            notificationService.addErrorMessage("User name already exists!");
            return "users/register";
        }
        notificationService.addInfoMessage("Account creation seccessful");
        return "redirect:/";
    }
}
