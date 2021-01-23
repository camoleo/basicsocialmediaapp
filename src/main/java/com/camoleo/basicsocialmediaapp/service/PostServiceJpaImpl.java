package com.camoleo.basicsocialmediaapp.service;

import com.camoleo.basicsocialmediaapp.model.Post;
import com.camoleo.basicsocialmediaapp.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
@Primary
public class PostServiceJpaImpl implements PostService{

    @Autowired
    private PostRepository postRepository;


    @Override
    public List<Post> findAll() {
        return this.postRepository.findAll();
    }

    @Override
    public List<Post> findLatest5() {
        return this.postRepository.findLatest5Posts((Pageable) PageRequest.of(0,5));
    }

    @Override
    public Post findById(Long id) {
        return this.postRepository.getOne(id); //do poprawy potem
    }

    @Override
    public Post create(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post edit(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public void deleteById(Long id) {
        this.postRepository.deleteById(id);

    }
}
