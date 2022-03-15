package client;

import server.Asking;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.concurrent.CompletableFuture;

public class Client {
    public static void main(String[] args) {
        try{
            Registry registry = LocateRegistry.getRegistry("localhost");
            Asking ask = (Asking) registry.lookup("Answer");
            Answering a_stub = (Answering) UnicastRemoteObject.exportObject(new AsnweringImpl(), 0) ;


            new Thread(() -> {
                try {
                    ask.asking("What is the meaning of this", a_stub);
                } catch (RemoteException e) {
                    System.err.println("Error on client: " + e);
                }
            }).start();

            System.out.println("Doing something else... not waiting");




        }catch (Exception e){
            System.err.println("Error on Client: \n" + e);
        }

    }
}
