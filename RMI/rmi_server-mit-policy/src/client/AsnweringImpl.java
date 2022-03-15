package client;

import java.rmi.RemoteException;

public class AsnweringImpl implements Answering{
    @Override
    public void clientPrint(String output) throws RemoteException {
        System.out.println(output);
        System.exit(0);
    }
}
