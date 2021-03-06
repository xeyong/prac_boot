package com.prac.springboot.web;

import com.prac.springboot.config.auth.LoginUser;
import com.prac.springboot.config.auth.dto.SessionUser;
import com.prac.springboot.service.posts.PostsService;
import com.prac.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller//머스타치 스타터 덕분에 매핑에서 경로와 뒤의 파일확장자는 자동으로지정
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    @GetMapping("/")//src/main/resources/templates로 오는거고
    public String index(Model model, @LoginUser SessionUser user) {
        //return "index";//index.mustache가 붙음
        model.addAttribute("posts", postsService.findAllDesc());

        /* SessionUser user = (SessionUser) httpSession.getAttribute("user"); 반복되는값 처리*/

        if(user != null){
            model.addAttribute("userName", user.getName());
        }
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
