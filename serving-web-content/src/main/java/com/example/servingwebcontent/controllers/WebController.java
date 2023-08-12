package com.example.servingwebcontent.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    @GetMapping("/home")
    public String renderForm(Model model)
    {
        Blogger blog = new Blogger();
        model.addAttribute("blog", blog);
        return ("hello");
    }
    @PostMapping("/addblogger")
    public String renderDetails(@ModelAttribute("blog") Blogger blog)
    {
        System.out.println(blog);
        return ("details");
    }
}

