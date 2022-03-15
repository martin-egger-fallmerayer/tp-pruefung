package variableClass.server;

import variableClass.GenericClass;
import variableClass.Task;

import java.rmi.RemoteException;

public class GenericClassImpl implements GenericClass {

    @Override
    public Object execute(Task task) throws RemoteException {
        return task.run();
    }
}
