package com.testarbeit.webshop.Controller;

import com.testarbeit.webshop.Server;
import com.testarbeit.webshop.data.Post;
import com.testarbeit.webshop.data.User;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("")
    public ArrayList<User> getAllUsers(){
        return Server.users;
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable(value = "username") String username){
        for (User u : Server.users) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }

        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found"
        );
    }

    @GetMapping("/{username}/post")
    public ArrayList<Post> getPostsFromUser (@PathVariable(value = "username") String username){
        for (User u : Server.users) {
            if (u.getUsername().equals(username)) {
                return u.getPosts();
            }
        }

        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found"
        );
    }


    @PostMapping(value = "/{username}/post", consumes = "application/json", produces = "application/json")
    public Post addPost(@PathVariable(value = "username") String username, @RequestBody Post post){
        for (User u : Server.users) {
            if (u.getUsername().equals(username)) {
                post.setAuthor(u.getUsername());
                u.createPost(post);
                return post;
            }
        }

        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "entity not found"
        );
    }


    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public User addUser(@RequestBody User user){
        for (User u : Server.users) {
            if (u.getUsername().equals(user.getUsername())) {
                throw new ResponseStatusException(
                        HttpStatus.BAD_REQUEST, "username already used"
                );
            }
        }

        Server.users.add(user);
        return user;
    }
}
