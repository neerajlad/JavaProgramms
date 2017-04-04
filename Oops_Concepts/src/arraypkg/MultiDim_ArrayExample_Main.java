package arraypkg;

public class MultiDim_ArrayExample_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring and initializing 2D array  
		int arr[][]={
					{1,2,3},
					{2,4,5},
					{4,4,5}
				};  
		  
		//printing 2D array  
		for(int i=0;i<3;i++){ // Row 
		 for(int j=0;j<3;j++){   // Col
		   System.out.print(arr[i][j] + " ");  
		 }  
		 System.out.println();  
		}  
	}

}
