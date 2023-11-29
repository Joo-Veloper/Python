package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j //로깅 기능을 위한 어노테이션
@Controller

public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;
    @GetMapping("/articles/new")
    public String newArticleForm() {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());// 로깅 코드

        //DTO를 엔티티로 변환합니다.
        Article article = form.toEntity();
        log.info(article.toString());

        // 리파지터리로 엔티티 DB에 저장
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        System.out.println(saved.toString());
        return "";
    }
    @GetMapping("/articles/{id}")
    public String show(@PathVariable Long id, Model model) {
        log.info("id = " + id);
        //1. id 조회
        Article articleEntity = articleRepository.findById(id).orElse(null);
        //2. model data
        model.addAttribute("article", articleEntity);
        //3. view page
        return "articles/show";
    }
    public String index() {
        return "";
    }
}