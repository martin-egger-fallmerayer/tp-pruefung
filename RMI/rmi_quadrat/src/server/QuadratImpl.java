package quadrat.server;

import quadrat.Quadrat;

import java.io.Serializable;
import java.rmi.RemoteException;

public class QuadratImpl implements Quadrat{
    @Override
    public long quadrat(long num) throws RemoteException {
        System.out.println(num);
        return (long) Math.pow(num, 2);
    }
}
