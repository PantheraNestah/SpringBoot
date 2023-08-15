package com.SpringBoot.jpaMvc.repository;

import com.SpringBoot.jpaMvc.model.BloggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface BloggerRepository extends JpaRepository<BloggerEntity, Serializable> {
    BloggerEntity findById(String id);
}
