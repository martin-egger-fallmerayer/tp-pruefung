package variableClass.client;

import variableClass.GenericClass;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class GenericClassClient {
    public static void main(String[] args) {

        try{
            Registry registry = LocateRegistry.getRegistry("localhost");
            GenericClass genericClass = (GenericClass) registry.lookup("GenericClass");

            callFunction(genericClass);
            /*new Thread(() -> callFunction(genericClass)).start();
            new Thread(() -> callFunction(genericClass)).start();*/

        }catch (Exception e){
            System.err.println("Error on Client: \n" + e);
        }
    }

    public static void callFunction(GenericClass genericClass) throws RemoteException {
        Test t = new Test(10, 3);
        double res;

        res = (double) genericClass.execute(t);

        System.out.println(res);
    }
}
