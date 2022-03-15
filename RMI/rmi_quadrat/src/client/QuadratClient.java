package quadrat.client;

import quadrat.Quadrat;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class QuadratClient {
    public static void main(String[] args) {
        String serverName = null;
        long res = 0, num = 0;

        Scanner s = new Scanner(System.in);

        System.out.print("Please input a the Servername: ");
        serverName = s.nextLine();

        System.out.print("Please input the parameter: ");
        num = Long.parseLong(s.nextLine());


        try{
            Registry registry = LocateRegistry.getRegistry(serverName);
            Quadrat quadrat = (Quadrat) registry.lookup("Quadrat");


            res = quadrat.quadrat(num);
            System.out.println("Response: "+res);
        }catch (Exception e){
            System.err.println("Error on Client: \n" + e);
        }
    }
}
