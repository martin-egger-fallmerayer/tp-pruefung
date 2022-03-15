package server.routes;

import org.json.JSONObject;
import server.Server;
import server.json.JSONUser;
import server.json.JSONPost;
import server.json.ResponseBuilder;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserEventHandler {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{username}")
    public Response getPostsByUser(@PathParam("username") String username){
        for(JSONUser user : Server.users){
            if(!user.getUsername().equals(username)) continue;
            return ResponseBuilder.build(200, user.getPosts());
        }
        return Response.status(404).entity("404 - Not Found").build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{username}/post")
    public Response addPost(@PathParam("username")String username, String reqBody){
        JSONObject body = new JSONObject(reqBody);
        String content = body.getString("content");
        JSONPost newPost = new JSONPost(username, content);
        for(JSONUser user : Server.users){
            if(!user.getUsername().equals(username)) continue;
            user.createPost(newPost);
            return ResponseBuilder.build(200, newPost);
        }
        return ResponseBuilder.build(404, "404 - Not Found");
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/create")
    public Response createUser(String reqBody){
        JSONObject body = new JSONObject(reqBody);
        String username = body.getString("username");
        String first_name = body.getString("first_name");
        String last_name = body.getString("last_name");
        String password = body.getString("password");
        JSONUser newUser = new JSONUser(username, first_name, last_name, password);

        Server.users.add(newUser);

        return ResponseBuilder.build(200, newUser);
    }

}
