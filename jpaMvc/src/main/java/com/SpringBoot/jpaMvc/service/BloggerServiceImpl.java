package com.SpringBoot.jpaMvc.service;

import com.SpringBoot.jpaMvc.model.BloggerEntity;
import com.SpringBoot.jpaMvc.repository.BloggerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BloggerServiceImpl implements BloggerService{
    @Autowired
    private BloggerRepository repository;
    @Override
    public void addBlogger(BloggerEntity blogger)
    {
        repository.save(blogger);
    }
    @Override
    public BloggerEntity findBloggerById(String id)
    {
        return (repository.findById(id));
    }
    @Override
    public List<BloggerEntity> findAllBloggers()
    {
        List<BloggerEntity> bloggers = repository.findAll();
        return (bloggers);
    }
    @Override
    @Transactional
    public void deleteBloggerById(String id)
    {
        repository.deleteById(id);
    }
    @Override
    @Transactional
    public void deleteAllBloggers()
    {
        repository.deleteAll();
    }
}
