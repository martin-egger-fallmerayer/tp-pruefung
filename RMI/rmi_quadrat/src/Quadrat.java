package quadrat;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Quadrat extends Remote {
    public long quadrat(long num) throws RemoteException;
}
