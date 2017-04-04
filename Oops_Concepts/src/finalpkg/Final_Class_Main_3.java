package finalpkg;

final class Bike1
{
	
	public void display()
	{
		System.out.println("Final class method");
	}
}  
									
public  class Final_Class_Main_3 extends Bike1{ // Final class can not inheritance

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b = new Bike1();
		b.display();
	}

}
