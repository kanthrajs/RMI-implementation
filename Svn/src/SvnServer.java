import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Stack;



public class SvnServer extends UnicastRemoteObject implements SvnInter {
    
	
	Sync GK = new Sync();
	
	protected SvnServer(Sync GK) throws RemoteException 
	{
		super();
		this.GK=GK;
	}
	@Override
	public void push(String ipaddress, Integer number) throws RemoteException {
		GK.sendData(ipaddress, number);
	}

	@Override
	public String pop() throws RemoteException {
		return GK.getData();
	}
 
	//ArrayList<Integer> a = new ArrayList<Integer>();
	
	@Override
	public String display() throws RemoteException {
	 return GK.getAll();
   }
	
	
}
