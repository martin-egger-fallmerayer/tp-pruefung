package server;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import server.json.JSONUser;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.ArrayList;

public class Server {
    private static final int port = 80;
    private static final String host = "http://localhost/";
    public static ArrayList<JSONUser> users;

    public static void main(String[] args) {

        Server.users = TestData.getTestUsers();

        URI baseUri = UriBuilder.fromUri(host).port(port).build();
        ResourceConfig config = ResourceConfig.forApplication(new MySocialMedia());
        JdkHttpServerFactory.createHttpServer(baseUri, config);

    }

}
