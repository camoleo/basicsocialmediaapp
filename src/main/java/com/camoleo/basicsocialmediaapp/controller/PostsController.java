package com.camoleo.basicsocialmediaapp.controller;

import com.camoleo.basicsocialmediaapp.model.Post;
import com.camoleo.basicsocialmediaapp.service.NotificationService;
import com.camoleo.basicsocialmediaapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PostsController {

    @Autowired
    private PostService postService;

    @Autowired
    private NotificationService notifyService;

    @RequestMapping("/posts/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {
        Post post = postService.findById(id);
        if(post == null){
            notifyService.addErrorMessage("Cannot find post #" + id);
            return "redirect:/";
        }
        model.addAttribute("post",post);
        return "posts/view";
    }

    @GetMapping("/posts")
    public String posts(@ModelAttribute ModelMap modelMap){
        List<Post> posts = postService.findAll();
        modelMap.addAttribute(("posts"), posts);
        return "posts/posts";
    }

    @GetMapping("/posts/create")
    public String viewPosts(ModelMap modelMap){
        modelMap.addAttribute("newPost",new Post());
        return "posts/create";
    }

    @PostMapping("/posts")
    public String viewPosts(@Valid @ModelAttribute("posts") Post post, ModelMap modelMap) {
        Post newPost = postService.create(post);
      modelMap.addAttribute("newPost", newPost);
        return "redirect:/posts";
    }


//    @GetMapping("posts/edit")
//    public String showEditForm(Model model) {
//        List<Post> posts = new ArrayList<>();
//        postService.findAll().iterator().forEachRemaining(posts::add);
//
//        model.addAttribute("form", new BooksCreationDto(books));
//        return "posts/editPostsForm";
//    }

}
