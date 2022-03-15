package variableClass;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GenericClass extends Remote {
    public Object execute(Task Class) throws RemoteException;
}
