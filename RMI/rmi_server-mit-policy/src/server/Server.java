package server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

// Security Manager
// -Djava.security.manager -Djava.security.policy=.\src\ClientPolicy.policy

public class Server {
    public static void main(String[] args) {
        try{

            AskingImpl s = new AskingImpl();
            Asking s_stub = (Asking) UnicastRemoteObject.exportObject(s, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Answer", s_stub);
            System.out.println("Server ready");


        }catch (RemoteException | AlreadyBoundException e){
            e.printStackTrace();
        }
    }


}
