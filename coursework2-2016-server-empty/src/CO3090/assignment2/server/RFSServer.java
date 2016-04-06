package CO3090.assignment2.server;

import CO3090.assignment2.*;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.rmi.*;
import java.rmi.server.*;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Question (2.3)
public class RFSServer extends UnicastRemoteObject implements RFSInterface
{	
    public RFSServer() throws RemoteException {
       super();
    }

    public static void main(String[] args) {
    	
    	if (System.getSecurityManager() == null) {
    	    System.setSecurityManager(new RMISecurityManager());
    	}
    	String name = "rmi://localhost/FileSearch";
    	try {
    	    RFSInterface engine = new RFSServer();
    	    
    	    /*complete this method*/
    	    
    	    Naming.rebind(name, engine);
    	    System.out.println("FileSearch Service bound");  
    	} catch (Exception e) {
    	    System.err.println("FolderSearch exception: " + 
    			       e.getMessage());
    	    e.printStackTrace();
    	}
    	
    	
    }


    //Question (2.3)
	@Override
	public Object executeQuery(/*some arguments, refer to RFSInterface.java*/) throws RemoteException {
		/*complete this method*/
		return null;
	}

    
}
