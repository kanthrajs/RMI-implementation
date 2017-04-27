import java.rmi.RemoteException;
import java.util.Hashtable;

public class Sync {
	Hashtable<String, User> ht = new Hashtable<String, User>();
	String clientip = "null"; 
	String all = "null";
	String variable = "null";
	User universal ;
	//Stack<Integer> s = new Stack<Integer>();
public synchronized void sendData(String ipaddress, Integer number) throws RemoteException {
		
	    this.clientip=ipaddress;
	    
		if(ht.containsKey(clientip))
		{
			User u = ht.get(clientip);
			this.universal = u;
			u.putIn(number);
		}
		else{
			User uinsert = new User();
			this.universal = uinsert;
			ht.put(clientip, universal);
			//User u = ht.get(ipaddress);
			uinsert.putIn(number);
			}
	}

/*-----------------------------------------------------*/

public synchronized String getData() throws RemoteException {
	
	   
	  
		this.variable = universal.getOut();
	
	
	return variable;
}

 /*-----------------------------------------------------*/   

//ArrayList<Integer> a = new ArrayList<Integer>();


public synchronized String getAll() throws RemoteException {
	
		all = universal.dispalyAll();
	return all;
} 


}
