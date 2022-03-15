package quadrat.server;

import quadrat.Quadrat;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class QuadratServer {
    public static void main(String[] args) {
        try{

            QuadratImpl q = new QuadratImpl();
            Quadrat q_stub = (Quadrat) UnicastRemoteObject.exportObject(q, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Quadrat", q_stub);

            System.out.println("Server ready");

        }catch (RemoteException | AlreadyBoundException e){
            e.printStackTrace();
        }
    }
}
