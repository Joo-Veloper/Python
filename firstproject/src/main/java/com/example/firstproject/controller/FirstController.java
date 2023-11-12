package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi") // url 요청 접수
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "승주님");
        return "greetings";
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "박승주");
        return "goodbye";
    }
}
