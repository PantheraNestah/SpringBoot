package com.SpringBoot.jpaMvc.service;

import com.SpringBoot.jpaMvc.model.BloggerEntity;

import java.util.List;

public interface BloggerService {
    void addBlogger(BloggerEntity blogger);
    BloggerEntity findBloggerById(String id);
    List<BloggerEntity> findAllBloggers();
    void deleteBloggerById(String id);
    void deleteAllBloggers();
}
