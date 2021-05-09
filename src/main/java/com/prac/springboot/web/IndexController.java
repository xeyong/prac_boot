package com.prac.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//머스타치 스타터 덕분에 매핑에서 경로와 뒤의 파일확장자는 자동으로지정
public class IndexController {
    @GetMapping("/")//src/main/resources/templates로 오는거고
    public String index(){
        return "index";//index.mustache가 붙음
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}
