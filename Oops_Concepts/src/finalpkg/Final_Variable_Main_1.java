package finalpkg;

/*
 * Final
 * 		- Variable
 * 				- If you make any variable as final, you cannot change the value of final variable(It will be constant)
 * 		- Method
 * 				- If you make any method as final, you cannot override it.
 * *	- Class
 * 				- Can not inherited
 * 
 */

/* Summary
 * 1) A constructor cannot be declared as final.
 * 2) Local final variable must be initializing during declaration.
 * 3) All variables declared in an interface are by default final.
 * 4) We cannot change the value of a final variable.
 * 5) A final method cannot be overridden.
 * 6) A final class not be inherited.
 * 7) If method parameters are declared final then the value of these parameters cannot be changed.
 * 8) It is a good practice to name final variable in all CAPS.
 * 9) final, finally and finalize are three different terms. 
 *    finally is used in exception handling and finalize is a method that is called by JVM during garbage collection.
 * */


public class Final_Variable_Main_1 {

	final int speedlimit=10;//1 final variable  
	final int MaxSpeed; // 2 In constractor
//	final int MinSpeed; // 3 not init
	public Final_Variable_Main_1() { // Cant be final
		// TODO Auto-generated constructor stub
		MaxSpeed=200;	
		//speedlimit = speedlimit + 30;
	}
	void run(){  
	  //speedlimit=400; // second case
		
		System.out.println("Speed Limit : " + speedlimit); // first case
		System.out.println("Max Speed : " + MaxSpeed); 
		
	}  
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Final_Variable_Main_1 objBike = new  Final_Variable_Main_1();  
		objBike.run();  
	}  
	

}
