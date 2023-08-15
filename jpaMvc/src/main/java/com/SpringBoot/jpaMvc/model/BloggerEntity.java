package com.SpringBoot.jpaMvc.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "bloggers",schema = "BlogSite")
public class BloggerEntity {
    @Id
    @GenericGenerator(name = "blogger_seq", strategy = "com.SpringBoot.jpaMvc.generator.IdGenerator")
    @GeneratedValue(generator = "blogger_seq")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "profession")
    private String profession;
    @Column(name = "content_category")
    private String content_category;
    @Column(name = "articles")
    private int articles;
    public BloggerEntity(){}

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setContent_category(String content_category) {
        this.content_category = content_category;
    }

    public String getContent_category() {
        return content_category;
    }

    public void setArticles(int articles) {
        this.articles = articles;
    }

    public int getArticles() {
        return articles;
    }
    @Override
    public String toString()
    {
        String bloggerString = "**********  BLOGGER    **********\n\t->Id: "+id+"\n\t->Name: "+name+"\n\t->Profession: "+profession+"\n\t->Category" +
                ": "+content_category+"\n\t->Articles: "+articles+"\n";
        return (bloggerString);
    }
}
