package com.example.demo.web.Repository;

import com.example.demo.web.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository  extends JpaRepository<Posts, Long> {
}
