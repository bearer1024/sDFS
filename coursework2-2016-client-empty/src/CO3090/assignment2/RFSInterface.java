package CO3090.assignment2;


public interface RFSInterface extends java.rmi.Remote {

    //Question (2.1)
    public Object /*some return type*/ 
          executeQuery(/*some arguments*/) throws java.rmi.RemoteException;

}
