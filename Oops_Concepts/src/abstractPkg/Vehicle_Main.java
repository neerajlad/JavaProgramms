package abstractPkg;

public class Vehicle_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle v = new Car();
		v.engine();
		v.color();
		v = new Truck();
		v.engine();
		
		// Non abstract concept
		Truck t = new Truck();
		t.vehicleBody();
		Car c = new Car();
		c.engine();
		t.engine();
		
	}

}
