package com.prac.springboot.domain.posts;

import com.prac.springboot.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long>{
//JpaRepository<>를 구현하면 CRUD메소드가 자동생성
}
