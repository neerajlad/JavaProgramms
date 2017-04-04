package exceptionHandlingPkg;

public class TryCatchFinal_Example_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ============== Multiple catch

		try {
			int a[] = new int[5];
			a[3] = 30 / 0;
		} 
			catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		//	e.printStackTrace();
		}
			catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		} 
			catch (Exception e) {
			System.out.println("common task completed");
		
		}

		System.out.println("rest of the code...");

		// ========== Nested try catch

		try {
		//	int c = 39 / 0;
				try {
					System.out.println("going to divide");
					int b = 39 / 0;
					System.out.println("First try block");
				} catch (ArithmeticException e) {
					System.out.println(e);
				}
				System.out.println("Main try block");
				try {
					int a[] = new int[5];
					a[2] = 4;
					System.out.println("Second try block");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
				}
	
				System.out.println("other statement");
		} catch (Exception e) {
			System.out.println("handeled");
		}

		System.out.println("normal flow..");

		// //// ========== Finally ============================
		// Java finally block is always executed whether exception is handled or
		// not.
		// Java finally block must be followed by try or catch block.
		try {
			int data = 25 / 10;
			System.out.println(data);
		} catch (NullPointerException a) {
			System.out.println(a);
		} 
		finally {
			System.out.println("finally block is always executed");			
		}
		
		System.out.println("rest of the code...Finished");
	}

}
