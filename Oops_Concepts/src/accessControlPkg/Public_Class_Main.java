package accessControlPkg;
import pack.*;

//The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.
public class Public_Class_Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pub_Class obj = new Pub_Class();  
		obj.msg();
		obj.i=10;
		System.out.println(obj.i);
	}

}

