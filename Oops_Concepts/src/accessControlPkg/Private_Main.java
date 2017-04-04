package accessControlPkg;

public class Private_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pri_Class obj=new Pri_Class();  
	     //System.out.println(obj.data);//Compile Time Error  =====================  
		 
		// obj.msg();//Compile Time Error         =====================
		 // if you want to use private data
		 
		 obj.display();

	}
	
	// Explanation for default methods
	int i;
	void DefaultMsg()
	{
		System.out.println("THis is default msg");
	}

}


  