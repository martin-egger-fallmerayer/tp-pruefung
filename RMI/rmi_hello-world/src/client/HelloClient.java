package helloworld.client;

import helloworld.server.Hello;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class HelloClient {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost");
            Hello h = (Hello) registry.lookup("Hello");
            String res = h.sayHello();
            System.out.println(res);
        }catch (Exception e){
            System.err.println("Error on Client: \n" + e);
        }
    }
}
