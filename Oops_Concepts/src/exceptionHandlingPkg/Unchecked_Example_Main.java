package exceptionHandlingPkg;

public class Unchecked_Example_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=10;
		int num2=10;
		/*Since I'm dividing an integer with 0
		 * it should throw ArithmeticException*/
		int res=num1/num2;
		System.out.println(res);
	   
		int arr[] ={1,2,3,4,5};
		/*My array has only 5 elements but
		 * I'm trying to display the value of 
		 * 8th element. It should throw
		 * ArrayIndexOutOfBoundsException*/
		System.out.println(arr[3]);
		
		
		try{
			int arr1[] ={1,2,3,4,5};
			System.out.println(arr1[7]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("The specified index does not exist " +
						"in array. Please correct the error.");
				//System.out.println(e.toString());
		//		e.printStackTrace();
			}
	
	}
	
}
