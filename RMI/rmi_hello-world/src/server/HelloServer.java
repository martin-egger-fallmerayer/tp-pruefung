package helloworld.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer {
    public static void main(String[] args) {
        try{
            HelloImpl h = new HelloImpl("Hello world!");
            Hello h_stub = (Hello) UnicastRemoteObject.exportObject(h, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Hello", h_stub);
            System.out.println("Server ready");

        }catch (RemoteException | AlreadyBoundException e){
            e.printStackTrace();
        }
    }
}
