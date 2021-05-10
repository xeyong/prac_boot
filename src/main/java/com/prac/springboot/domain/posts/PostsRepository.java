package com.prac.springboot.domain.posts;

import com.prac.springboot.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long>{
//JpaRepository<>를 구현하면 CRUD메소드가 자동생성
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")//JPA에서 기존으로 제공하지않는 메소드는 쿼리로 작성해서 DB에 접근가능
    List<Posts> findAllDESC();//걍 가독성을 높히기위해서 쿼리작업한거지 findall()기존제공 메서드랑 같음
}
