package com.testarbeit.webshop;

import com.testarbeit.webshop.data.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class Server {
    public static ArrayList<User> users;

    public static void main(String[] args) {
        users = TestData.getTestUsers();

        SpringApplication.run(Server.class, args);
    }

}
