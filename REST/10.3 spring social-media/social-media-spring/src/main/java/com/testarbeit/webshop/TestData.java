package com.testarbeit.webshop;



import com.testarbeit.webshop.data.Post;
import com.testarbeit.webshop.data.User;

import java.util.ArrayList;

public class TestData {

    public static ArrayList<User> getTestUsers(){

        ArrayList<User> testUsers = new ArrayList<>();

        User user01 = new User("drewisgooden", "Andrew", "Gooden", "12345678");
        User user02 = new User("Dom", "Dominik", "Hoffmann", "12345678");
        User user03 = new User("JimmyHere", "Tyler", "Collins", "12345678");
        User user04 = new User("youngbusto", "Brandon", "Moore", "12345678");
        User user05 = new User("JeffSimmons", "Jeff", "Simmons", "12345678");
        User user06 = new User("weaklingchris", "Chris", "Sickler", "12345678");
        User user07 = new User("AnthonyPadilla", "Anthony", "Padilla", "12345678");
        User user08 = new User("ayitspnayo", "Nathan", "Enick", "12345678");
        User user09 = new User("adam_perkins", "Adam", "Perkins", "12345678");
        User user10 = new User("kennedytayl0r", "Taylor", "Kennedy", "12345678");
        User user11 = new User("BrandonBowen", "Brandon", "Bowen", "12345678");
        User user12 = new User("SammyClassicSonicFan", "Samuel", "Thomas", "12345678");
        User user13 = new User("Daniel_Gomez", "Daniel", "Gomez", "12345678");
        User user14 = new User("billwurtz", "William", "Wurtz", "12345678");
        User user15 = new User("Katie_Ryan", "Katie", "Ryan", "12345678");

        user01.createPost(new Post(user01.getUsername(), "Road work ahead? Uh yea, I sure hope it does."));
        user02.createPost(new Post(user02.getUsername(), "Do it for the vine."));
        user03.createPost(new Post(user03.getUsername(), "It is Wednesday my dudes."));
        user04.createPost(new Post(user04.getUsername(), "What are those?"));
        user05.createPost(new Post(user05.getUsername(), "It’s an avocado, thanks!"));
        user06.createPost(new Post(user06.getUsername(), "Chris, is that a weed?"));
        user07.createPost(new Post(user07.getUsername(), "Two bros, chillin’ in a hot tub, 5 feet apart cause they’re not gay."));
        user08.createPost(new Post(user08.getUsername(), "I don’t have enough money for chicken nuggets."));
        user09.createPost(new Post(user09.getUsername(), "Hi, welcome to Chili’s."));
        user10.createPost(new Post(user10.getUsername(), "Come get y’all juice."));
        user11.createPost(new Post(user11.getUsername(), "I’m sorry I didn’t see you there. I was too busy blocking out the haters."));
        user12.createPost(new Post(user12.getUsername(), "When will you learn that your actions have consequences!?"));
        user13.createPost(new Post(user13.getUsername(), "Wtf, is this allowed? Is this allowed?"));
        user14.createPost(new Post(user14.getUsername(), "Oh, hi. Thanks for checking in. I’m still a piece of garbage."));
        user15.createPost(new Post(user15.getUsername(), "I smell like beef."));

        testUsers.add(user01);
        testUsers.add(user02);
        testUsers.add(user03);
        testUsers.add(user04);
        testUsers.add(user05);
        testUsers.add(user06);
        testUsers.add(user07);
        testUsers.add(user08);
        testUsers.add(user09);
        testUsers.add(user10);
        testUsers.add(user11);
        testUsers.add(user12);
        testUsers.add(user13);
        testUsers.add(user14);
        testUsers.add(user15);

        return testUsers;
    }

}
