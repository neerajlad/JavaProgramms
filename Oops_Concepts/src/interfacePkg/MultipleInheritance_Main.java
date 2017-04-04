package interfacePkg;

public class MultipleInheritance_Main implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		MultipleInheritance_Main obj = new MultipleInheritance_Main();
		obj.print();
	}
}
