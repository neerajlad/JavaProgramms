package interfacePkg;

public class interface_Main_1 implements Printable, Showable {

	public void print() {
	System.out.println("Hello");
	
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		interface_Main_1 obj = new interface_Main_1();
		obj.print();
		obj.show();
		
	}
}