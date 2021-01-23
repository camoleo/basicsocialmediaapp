package com.camoleo.basicsocialmediaapp.repository;

import com.camoleo.basicsocialmediaapp.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
@Query(value = "SELECT p FROM posts p LEFT JOIN FETCH p.userName ORDER BY p.createdAt DESC")
    List<Post>findLatest5Posts(Pageable pageable);

}
