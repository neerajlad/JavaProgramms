package accessControlPkg;
import pack.*;

//The protected access modifier is accessible within package and outside the package but through inheritance only.
public class Protected_Class_Main extends Pro_Class
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//msg_Parent();
		Protected_Class_Main pb = new Protected_Class_Main();
		pb.msg();
		pb.msg_Parent(); // can access as it is extends 
		
		Pro_Class pa = new Pro_Class();
		pa.msg();
	//	pa.msg_Parent(); // not accessible as it is not visible
		
		// Directly can not access
		Pro_Parent pp = new Pro_Parent();
		//pp.msg_Parent();
	}

}

