package com.camoleo.basicsocialmediaapp.controller;

import com.camoleo.basicsocialmediaapp.model.Post;
import com.camoleo.basicsocialmediaapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String index(Model model){
        List<Post> latest5Posts=postService.findAll();
        model.addAttribute("latest5posts",latest5Posts);

        List<Post> latest3Posts= latest5Posts.stream()
                .collect(Collectors.toList());
        model.addAttribute("latest3posts",latest3Posts);

        return "index";
    }

}
