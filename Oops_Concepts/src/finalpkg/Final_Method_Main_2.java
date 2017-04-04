package finalpkg;

public class Final_Method_Main_2 extends Bike {

	// 1 Override is not possible
//	void run() {
//		System.out.println("running safely with 100kmph");
//	}

	// 2 Parameter as Final
	void cube(final int n){  
		//n=n+2;//can't be changed as n is final
		System.out.println("n:" + n);
	}
	public static void main(String args[]) {
		Final_Method_Main_2 honda = new Final_Method_Main_2();
		honda.run();
		honda.engine(); // Inheritance is possible
		honda.cube(2000); // Parameter concept
	}
}