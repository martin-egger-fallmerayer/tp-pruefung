package server.routes;

import org.json.JSONArray;
import server.Server;
import server.json.JSONUser;
import server.json.ResponseBuilder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/posts")
public class PostsEventHandler {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllPosts(){
        JSONArray allPosts = new JSONArray();
        for (JSONUser user : Server.users) {
            if(!user.has("posts")) continue;
            List<Object> posts = user.getJSONArray("posts").toList();
            posts.forEach(allPosts::put);
        }
        return ResponseBuilder.build(200, allPosts.toString());
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{username}")
    public Response getPostsByUser(@PathParam("username") String username){
        for(JSONUser user : Server.users){
            if(!user.getUsername().equals(username)) continue;
            return ResponseBuilder.build(200, user.getPosts());
        }
        return ResponseBuilder.build(404, "404 - Not Found");
    }

}