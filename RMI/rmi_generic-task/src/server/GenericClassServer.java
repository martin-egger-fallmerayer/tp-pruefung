package variableClass.server;

import variableClass.GenericClass;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class GenericClassServer {
    public static void main(String[] args) {
        try{
            GenericClassImpl g = new GenericClassImpl();
            GenericClass g_stub = (GenericClass) UnicastRemoteObject.exportObject(g, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("GenericClass", g_stub);

            System.out.println("Server ready");

        }catch (RemoteException | AlreadyBoundException e){
            e.printStackTrace();
        }
    }
}
