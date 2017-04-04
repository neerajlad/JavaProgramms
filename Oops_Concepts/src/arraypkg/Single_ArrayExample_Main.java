package arraypkg;



public class Single_ArrayExample_Main {

	static void min(int arr[]) {
		int min = arr[0];
		System.out.println("Len: " + arr.length);
		for (int i = 1; i < arr.length; i++)
			if (min > arr[i])
				min = arr[i];
		System.out.println(min);
	}

	public static void main(String args[]) {

		// ---------------- 1
		int a[] = new int[5];// declaration and instantiation
		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		int x;
		// printing array
		for (int i = 0; i < a.length; i++)
		{
			// length is the property of array			
			System.out.println(a[i]);
		}
		// ----------------- 2
		int b[] = { 33, 3, 4, 5 };// declaration, instantiation and
									// initialization
		System.out.println("Length: " + b.length);
		// printing array
		for (int i = 0; i < b.length; i++)// length is the property of array
		{
			// System.out.println("i:"+i);

			System.out.println(b[i]);
		}
		// ------------ 3
		min(b);// passing array to method
		
	}

}
