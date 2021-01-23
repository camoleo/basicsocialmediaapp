package com.camoleo.basicsocialmediaapp.controller;

import com.camoleo.basicsocialmediaapp.model.LoginForm;

import com.camoleo.basicsocialmediaapp.model.User;
import com.camoleo.basicsocialmediaapp.service.NotificationService;
import com.camoleo.basicsocialmediaapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private NotificationService notifyService;

    @RequestMapping("/users/login")
    public String login(LoginForm loginForm) {
        return "users/login";
    }

    // Login form with error
    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            notifyService.addErrorMessage("Please fill the form correctly!");
            return "/users/login";
        }
        if (!userService.authenticate(
                loginForm.getUserName(), loginForm.getPassword())) {
            notifyService.addErrorMessage("Invalid login!");
            return "users/login";
        }
        notifyService.addInfoMessage("Login successful :)");
        return "redirect:/";
    }
    @RequestMapping("users")
        public String viewUsers(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users/users";
        }

}