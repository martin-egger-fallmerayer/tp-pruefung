package com.testarbeit.webshop.data;

import java.util.ArrayList;

public class User {
    private String username;
    private String firstname;
    private String lastname;
    private String password;
    private ArrayList<Post> posts;

    public User(String username, String firstname, String lastname, String password) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.posts = new ArrayList<>();
    }

    public void createPost(Post post){
        this.posts.add(post);
    }


    public String getUsername() {return username;}
    public String getFirstname() {return firstname;}
    public String getLastname() {return lastname;}
    public String getPassword() {return password;}
    public ArrayList<Post> getPosts() {return posts;}


}
