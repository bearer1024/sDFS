package CO3090.assignment2;


public interface RFSInterface extends java.rmi.Remote {

    //Question (2.1)
    public Object /*some return type*/ 
          executeQuery(String query) throws java.rmi.RemoteException;
//the parameter should be a String or Collection classes?
}
