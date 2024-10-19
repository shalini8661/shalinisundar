package expect;

import java.util.InputMismatchException;

public class NestedTry {
	 public static void main(String[] args)
	 {
	 System.out.println(1);
	 System.out.println(2);
	 System.out.println(3);
      try {
    	  System.out.println(4/2);
    	  try {
    		  String s=null;
    		  System.out.println(s.charAt(2));
			
		} catch (InputMismatchException e) {
			
			System.out.println("Mismatch in the Given String ");
		}
      finally
        {
	      System.out.println("inner finally");
         }
		
	}
      catch (Exception e) {
    	 
    	 
			
			System.out.println("Null value is String");
		}
        finally
        {
        	System.out.println("Outer finally");
        }
      System.out.println(5);
 	 System.out.println(6);
 	 System.out.println(7);
      
	}
}