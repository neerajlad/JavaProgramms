package inheritancePkg;

class Car{
	public Car()
	{
		System.out.println("Class Car");
	}
	public void vehicleType()
	{
		System.out.println("Vehicle Type: Car");
	}
}
class Maruti extends Car{
	public Maruti()
	{
		System.out.println("Class Maruti");
	}
	public void brand()
	{
		System.out.println("Brand: Maruti");
	}
	public void speed()
	{
		System.out.println("Max: 90Kmph");
	}
}
public class MultiLevel_Inheritance_Maruti800 extends Maruti{

	 public MultiLevel_Inheritance_Maruti800()
	 {
		 System.out.println("Maruti Model: 800");
	 }
	 public void speed()
		{
			System.out.println("Max: 80Kmph");
		}
	 public static void main(String args[])
	 {
		 MultiLevel_Inheritance_Maruti800 obj=new MultiLevel_Inheritance_Maruti800();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();
	 }
}