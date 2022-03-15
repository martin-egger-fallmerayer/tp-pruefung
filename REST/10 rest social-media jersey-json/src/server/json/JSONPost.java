package server.json;

import org.json.JSONObject;

import java.time.LocalDate;

public class JSONPost extends JSONObject {

    public JSONPost(String author, String content){
        this.put("author", author);
        this.put("content", content);
        this.put("date", LocalDate.now());
        this.put("likes", 0);
    }

}

/*
---Post---
{
    "content": "Hello, World!"
}

---Response---
{
    "date": "2022-01-12",
    "author": "maxmustermann75",
    "content": "Hello, World!",
    "likes": 0
}
*/