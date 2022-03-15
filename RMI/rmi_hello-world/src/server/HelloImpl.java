package helloworld.server;

import java.io.Serializable;
import java.rmi.RemoteException;

public class HelloImpl implements Hello, Serializable {

    private final String message;

    public HelloImpl(String message) {
        this.message = message;
    }

    @Override
    public String sayHello() throws RemoteException {
        return message;
    }

}
