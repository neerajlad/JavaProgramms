package accessControlPkg;

import pack.Def_Class;

public class Default_Class_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Def_Class obj = new Def_Class();//Compile Time Error  
		Private_Main PM = new Private_Main();
	//	obj.msg();//Compile Time Error  ===============================
		PM.DefaultMsg();
		
		
	}

}


//In the above example, the scope of class A and its method msg() is default 
//so it cannot be accessed from outside the package.