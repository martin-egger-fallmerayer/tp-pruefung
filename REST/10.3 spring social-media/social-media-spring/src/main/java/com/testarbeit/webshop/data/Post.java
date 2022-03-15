package com.testarbeit.webshop.data;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Post {
    private String author;
    private String content;
    private LocalDateTime date;

    public Post(String content) {
        this.author = "undefined";
        this.content = content;
        this.date = LocalDateTime.now();
    }

    public Post(String author, String content) {
        this.author = author;
        this.content = content;
        this.date = LocalDateTime.now();
    }


    public String getAuthor() {return author;}
    public String getContent() {return content;}
    public LocalDateTime getDate() {return date;}

    public void setAuthor(String author) {this.author = author;}
}
