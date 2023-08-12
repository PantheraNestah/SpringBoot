package com.example.servingwebcontent.controllers;

public class Blogger {
    private String name;
    private int id;

    public Blogger(){}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String blogger = "Blogger Name: "+name+"\nBlogger Id "+id+"\n";
        return (blogger);
    }
}
