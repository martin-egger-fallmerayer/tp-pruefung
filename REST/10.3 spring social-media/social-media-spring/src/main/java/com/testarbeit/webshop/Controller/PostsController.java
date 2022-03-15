package com.testarbeit.webshop.Controller;

import com.testarbeit.webshop.Server;
import com.testarbeit.webshop.data.Post;
import com.testarbeit.webshop.data.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PostsController {

    @GetMapping("/posts")
    public ArrayList<Post> getAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();

        for (User u : Server.users) {
            posts.addAll(u.getPosts());
        }
        return posts;
    }


}
