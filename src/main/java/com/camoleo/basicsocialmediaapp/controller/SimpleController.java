package com.camoleo.basicsocialmediaapp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {
    @GetMapping("/")
    public String layout(){
     return "layout";
    }

}

