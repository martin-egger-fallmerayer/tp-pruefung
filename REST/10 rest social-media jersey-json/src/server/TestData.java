package server;

import server.json.JSONPost;
import server.json.JSONUser;

import java.util.ArrayList;

public class TestData {

    public static ArrayList<JSONUser> getTestUsers(){

        ArrayList<JSONUser> testUsers = new ArrayList<>();

        JSONUser user01 = new JSONUser("drewisgooden", "Andrew", "Gooden", "12345678");
        JSONUser user02 = new JSONUser("Dom", "Dominik", "Hoffmann", "12345678");
        JSONUser user03 = new JSONUser("JimmyHere", "Tyler", "Collins", "12345678");
        JSONUser user04 = new JSONUser("youngbusto", "Brandon", "Moore", "12345678");
        JSONUser user05 = new JSONUser("JeffSimmons", "Jeff", "Simmons", "12345678");
        JSONUser user06 = new JSONUser("weaklingchris", "Chris", "Sickler", "12345678");
        JSONUser user07 = new JSONUser("AnthonyPadilla", "Anthony", "Padilla", "12345678");
        JSONUser user08 = new JSONUser("ayitspnayo", "Nathan", "Enick", "12345678");
        JSONUser user09 = new JSONUser("adam_perkins", "Adam", "Perkins", "12345678");
        JSONUser user10 = new JSONUser("kennedytayl0r", "Taylor", "Kennedy", "12345678");
        JSONUser user11 = new JSONUser("BrandonBowen", "Brandon", "Bowen", "12345678");
        JSONUser user12 = new JSONUser("SammyClassicSonicFan", "Samuel", "Thomas", "12345678");
        JSONUser user13 = new JSONUser("Daniel_Gomez", "Daniel", "Gomez", "12345678");
        JSONUser user14 = new JSONUser("billwurtz", "William", "Wurtz", "12345678");
        JSONUser user15 = new JSONUser("Katie_Ryan", "Katie", "Ryan", "12345678");

        user01.createPost(new JSONPost(user01.getUsername(), "Road work ahead? Uh yea, I sure hope it does."));
        user02.createPost(new JSONPost(user02.getUsername(), "Do it for the vine."));
        user03.createPost(new JSONPost(user03.getUsername(), "It is Wednesday my dudes."));
        user04.createPost(new JSONPost(user04.getUsername(), "What are those?"));
        user05.createPost(new JSONPost(user05.getUsername(), "It’s an avocado, thanks!"));
        user06.createPost(new JSONPost(user06.getUsername(), "Chris, is that a weed?"));
        user07.createPost(new JSONPost(user07.getUsername(), "Two bros, chillin’ in a hot tub, 5 feet apart cause they’re not gay."));
        user08.createPost(new JSONPost(user08.getUsername(), "I don’t have enough money for chicken nuggets."));
        user09.createPost(new JSONPost(user09.getUsername(), "Hi, welcome to Chili’s."));
        user10.createPost(new JSONPost(user10.getUsername(), "Come get y’all juice."));
        user11.createPost(new JSONPost(user11.getUsername(), "I’m sorry I didn’t see you there. I was too busy blocking out the haters."));
        user12.createPost(new JSONPost(user12.getUsername(), "When will you learn that your actions have consequences!?"));
        user13.createPost(new JSONPost(user13.getUsername(), "Wtf, is this allowed? Is this allowed?"));
        user14.createPost(new JSONPost(user14.getUsername(), "Oh, hi. Thanks for checking in. I’m still a piece of garbage."));
        user15.createPost(new JSONPost(user15.getUsername(), "I smell like beef."));

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
