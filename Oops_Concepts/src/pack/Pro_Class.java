package pack;

public class Pro_Class extends Pro_Parent{

	public void msg()
	{
		System.out.println("Protected :msg :: Protected_Class_A");
		msg_Parent();
		// Only accessible to immediate subclass
		Pro_Parent pp1 = new Pro_Parent();
		pp1.msg_Parent(); // error : not visible
	}
	
	
}
