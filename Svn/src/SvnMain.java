import java.rmi.Naming;


public class SvnMain {

	public static void main(String[] args) {
		try {
			System.out.println("Server has Started!!");
			Sync GK = new Sync();
			Naming.bind("Svn",new SvnServer(GK));
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

}
