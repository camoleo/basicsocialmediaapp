package com.camoleo.basicsocialmediaapp.service;

import com.camoleo.basicsocialmediaapp.model.Post;
import com.camoleo.basicsocialmediaapp.model.User;

import java.util.List;

public interface PostService {
    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}
