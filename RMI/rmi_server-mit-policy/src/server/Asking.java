package server;

import client.Answering;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Asking extends Remote {
    public void asking(String questions, Answering stub) throws RemoteException;
}
