package com.example.spring_mvc1.controller;

import com.example.spring_mvc1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/form")
    private String readForm(@ModelAttribute User user) {
        return "form";
    }

    @PostMapping("/form")
    private String confirm(@ModelAttribute User user) {
        return "confirm";
    }
}
