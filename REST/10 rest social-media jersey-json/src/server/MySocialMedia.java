package server;

import server.routes.PostsEventHandler;
import server.routes.UserEventHandler;
import server.routes.UsersEventHandler;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class MySocialMedia extends Application {
    @Override
    public Set<Class<?>> getClasses(){
        HashSet<Class<?>> h = new HashSet<>();
        h.add(UsersEventHandler.class);
        h.add(UserEventHandler.class);
        h.add(PostsEventHandler.class);
        return h;
    }
}
