package CO3090.assignment2.client;
import CO3090.assignment2.*;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Scanner;


public class RFSClient {
	
    public static void main(String args[]) {
        if (System.getSecurityManager() == null) {
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            String name = "rmi://localhost/FolderSearch";
            RFSInterface comp = (RFSInterface) Naming.lookup(name);
            
            Registry registry = LocateRegistry.getRegistry(name);
            Scanner scanner = new Scanner(System.in);
            String query = scanner.nextLine();
            comp.executeQuery(query);
            //Question (4.1) and (4.2)
            /*complete this method*/
            
            
        } catch (Exception e) {
            System.err.println("exception: " + 
                               e.getMessage());
            e.printStackTrace();
        }
    }
}
