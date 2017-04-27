import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class SvnClient {

	public static void main(String[] args) throws UnknownHostException, MalformedURLException, RemoteException, NotBoundException {
		
		InetAddress ip = InetAddress.getLocalHost();
			String ipaddr = ip.getHostAddress();
			int choice = 0;
			SvnInter si = (SvnInter) Naming.lookup("rmi://localhost/Svn");/*change to Server Running IP */
			while(true)
			{
				try{
			System.out.println("Menu \n 1. For push Integer\n 2. For pop\n 3. For Display\n 4. Exit");
			Scanner key = new Scanner(System.in);/*it takes user values from the keyboard*/
			choice = key.nextInt();/*this method takes the integer value from the keyboard and assign it to choice*/
			if(choice==1)
			{
				int value = key.nextInt();
	
					Integer i = new Integer(value);
				
				si.push(ipaddr, i);
				System.out.println("Successfully pushed!");
			
		   }
			else if(choice==2)
			{
				String poped = si.pop();
				if(poped.equals("null"))
				{
					System.out.println("No element in stack");
				}
				else{
					 System.out.println(poped + " has been popped");
				}
			  
			}
			else if(choice==3)
			{
				//ArrayList<Integer>ar = new ArrayList<Integer>();
				if(si.display().equals("null"))
				{
					System.out.println("No element in stack");
				}
				else{
					 System.out.println(si.display());
				}
				 
			 }
			else if( choice==4)System.exit(0);
			else
				System.out.println("Invalid digit pressed! Try Again");
			
		}
		catch(InputMismatchException ie)
		{
			System.out.println("not an Integer,Try Again");
		}
		catch(Exception e){
			e.printStackTrace();
		}
			}
	}

}
