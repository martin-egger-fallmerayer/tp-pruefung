package client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Answering extends Remote {
    public void clientPrint(String output) throws RemoteException;

}
