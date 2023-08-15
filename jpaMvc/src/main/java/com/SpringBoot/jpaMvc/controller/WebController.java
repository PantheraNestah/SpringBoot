package com.SpringBoot.jpaMvc.controller;

import com.SpringBoot.jpaMvc.model.BloggerEntity;
import com.SpringBoot.jpaMvc.service.BloggerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {
    @Autowired
    private BloggerServiceImpl service;
    @GetMapping("/")
    public ModelAndView rootController(Model mod)
    {
        List<String> categoryList = Arrays.asList("Technology","Business","Academic","Entertainment","Sports");
        mod.addAttribute("categoryList",categoryList);
        List<BloggerEntity> bloggersList = service.findAllBloggers();
        mod.addAttribute("bloggersList", bloggersList);
        return (new ModelAndView("index","blog",new BloggerEntity()));
    }
    @PostMapping("/addBlogger")
    public String addBlogger(@ModelAttribute("blog") BloggerEntity blog)
    {
        System.out.println(blog);
        service.addBlogger(blog);
        return ("redirect:/");
    }
}
