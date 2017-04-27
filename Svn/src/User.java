import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;


public class User {
	Integer var;
	Integer pvar;
	String pops = "null";
	Stack<Integer> s = new Stack<Integer>();
	ArrayList<Integer> a=new ArrayList<Integer>();
	String allval = "null";
	
   public void putIn(Integer variable)
   {
	  // s.push(variable);
	// s.push(variable);
	   this.pvar=variable;
	   
	   this.s.push(pvar);
   }
   public String getOut()
   {
	   try{
		   if(s.isEmpty())
		   {
			   pops = "null";
		   }
		   else
		   {
			   var = this.s.pop();
			   pops = var+"";
		   }
	  
	   
	   }
	   catch(Exception e){System.out.println("something happened!!");}
	  
	   return pops;
   }
   public String dispalyAll()
   {
	   
	  /* while(!this.s.empty())
	   {
		   a.add(getOut());
	   }*/
	   if(s.isEmpty())
	   {
		   allval = "null";
	   }
	   else
	   {
		   Collections.sort(s);
		   this.allval = Arrays.toString(this.s.toArray());
		   
	   }
	   return allval;
	  
	   
	
   }
}
