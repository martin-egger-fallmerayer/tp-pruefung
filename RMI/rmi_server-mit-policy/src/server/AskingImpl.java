package server;

import client.Answering;

import java.rmi.RemoteException;

public class AskingImpl implements Asking {

    @Override
    public void asking(String question, Answering stub) throws RemoteException {

        //wait for a long time
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String answer = "The answer is to your question '" + question + "' is probably the holy number 69!";
        stub.clientPrint(answer);


    }
}
