package server.json;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONUser extends JSONObject {

    public JSONUser(String username, String first_name, String last_name, String password, JSONPost[] posts){
        this.put("username", username);
        this.put("first_name", first_name);
        this.put("last_name", last_name);
        this.put("password", password);
        this.put("posts", posts);
    }

    // Wird benötigt, wenn ein neuer User erstellt wird
    public JSONUser(String username, String first_name, String last_name, String password){
        this.put("username", username);
        this.put("first_name", first_name);
        this.put("last_name", last_name);
        this.put("avatar_url", "");
        this.put("password", password);
        this.put("posts", new JSONArray());
    }

    public void createPost(JSONPost post){
        if (!this.has("posts")) this.put("posts", new JSONArray());
        this.getJSONArray("posts").put(post);
    }

    // Getter
    public String getUsername() { return this.get("username").toString(); }
    public String getPosts(){ return this.get("posts").toString(); }

    // Convenience and readability methods
    public boolean hasPosts(){
        return this.getJSONArray("posts").length() != 0;
    }

}

/*
---Create---
{
    "username": "maxmustermann75",
    "first_name": "Max",
    "last_name": "Mustermann",
    "password": "Kennwort0"
}

---Response---
{
    "password": "Kennwort0",
    "avatar_url": "",
    "last_name": "Mustermann",
    "first_name": "Max",
    "posts": [],
    "username": "maxmustermann75"
}
* */