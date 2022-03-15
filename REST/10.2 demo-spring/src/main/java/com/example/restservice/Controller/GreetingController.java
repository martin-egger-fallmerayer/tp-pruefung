package com.example.restservice.Controller;

import com.example.restservice.data.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static ArrayList<Greeting> greetings = new ArrayList<>();

    @PostMapping(value= "/greeting", consumes = "application/json", produces = "application/json")
    public Greeting greeting(@RequestBody Greeting g) {
        greetings.add(g);
        return g;
    }

    @GetMapping(value = "/greeting/{id}")
    public ResponseEntity<Object> addGreeting(@PathVariable(value = "id") int id){
        for ( Greeting g: greetings) {
            if (g.getId() == id) {
                return new ResponseEntity<>(g, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("404 - Entity not found", HttpStatus.NOT_FOUND);
    }

}
