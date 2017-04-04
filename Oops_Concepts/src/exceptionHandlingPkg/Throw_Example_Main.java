package exceptionHandlingPkg;

public class Throw_Example_Main {

	static void validate(int age){  
	     if(age<0)  
	     {
	    	 throw new ArithmeticException("Invalid Msg");
	     }
	     else if(age < 18)
	     {
	    	 throw new NullPointerException("Not Eligible for Vote");  
	     }
	     else
	     {
	    	 System.out.println("Welcome to Vote");
	     }
	   }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
			validate(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}  
		 try {
			validate(13);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
			System.out.println(e.getMessage());
			
			
		}
		 
		 validate(20);
	      System.out.println("rest of the code...");  
		
	}

}
