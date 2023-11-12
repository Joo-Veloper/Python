package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
public class ArticleController {
    @GetMapping("/new")
    public String newArticleForm() {
        return "articles/new";
    }
    @PostMapping("/create")
    public String createArticle(ArticleForm form) {
        System.out.println(form.toString());
        Article article = form.toEntity();
        Article saved = articleRepository.save(article);
        return "";
    }

}
