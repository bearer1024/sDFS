package CO3090.assignment2;


public interface RFSInterface extends java.rmi.Remote {

    //Question (2.1)
    public Object /*some return type*/ //maybe the return type could be FileItem or FileItemType something
          executeQuery(String query) throws java.rmi.RemoteException;

}
