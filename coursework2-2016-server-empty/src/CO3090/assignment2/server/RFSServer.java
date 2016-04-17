package CO3090.assignment2.server;

import CO3090.assignment2.*;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
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
    /*	try {
			RFSServer rfsServer = new RFSServer();
			RFSInterface rfsInterface = (RFSInterface) UnicastRemoteObject.exportObject(rfsServer);
			Registry registry = LocateRegistry.getRegistry(name);
			registry.rebind(name,rfsInterface);
			System.err.println("Server ready");
		} catch (RemoteException e1) {
			System.err.println("Server exception:"+e1.toString());
			e1.printStackTrace();
		}*/
    	try {
    	    RFSInterface engine = new RFSServer();
    	    Registry registry = LocateRegistry.getRegistry(name);
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
	public Object executeQuery(SearchCriteria query) throws RemoteException {
		/*complete this method*/
		Vector<HashMap<String,String>> vector = new Vector<HashMap<String,String>>();
		//return query.execute(new Vector<HashMap>());
		return query.execute(new Vector<HashMap>());

	}

    
}
