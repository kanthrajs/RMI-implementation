import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Hashtable;


public interface SvnInter extends Remote
{
    public void push(String ipaddress,Integer number)throws RemoteException;
    public String pop()throws RemoteException;
    public String  display()throws RemoteException;
  
}
