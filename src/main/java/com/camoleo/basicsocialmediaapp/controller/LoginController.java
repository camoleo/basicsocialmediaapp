package com.camoleo.basicsocialmediaapp.controller;

import com.camoleo.basicsocialmediaapp.model.LoginForm;
import com.camoleo.basicsocialmediaapp.service.NotificationService;
import com.camoleo.basicsocialmediaapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notifiyService;

    @RequestMapping(value = "/users/login")
    public String login(LoginForm loginForm){
        return "users/login";
    }

    @RequestMapping(value = "users/login", method = RequestMethod.POST)
    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            notifiyService.addErrorMessage("UPS something's wrong.. Please fill in the form correctly!");
            return "users/login";
        }
        if(!userService.authenticate(
                loginForm.getUserName(),loginForm.getPassword())){
            notifiyService.addErrorMessage("Invalid login!");
            return "users/login";
        }
        notifiyService.addInfoMessage("Login succesful :)");
        return "redirect";
    }
}
