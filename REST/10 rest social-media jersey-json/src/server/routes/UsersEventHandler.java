package server.routes;

import org.json.JSONArray;
import server.json.JSONUser;
import server.json.ResponseBuilder;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static server.Server.users;

@Path("/users")
public class UsersEventHandler {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllUsers(){
        JSONArray allUsers = new JSONArray();
        for (JSONUser user : users) allUsers.put(user);
        return ResponseBuilder.build(200, allUsers);
    }

}
