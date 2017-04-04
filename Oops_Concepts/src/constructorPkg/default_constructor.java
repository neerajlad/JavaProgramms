package constructorPkg;

public class default_constructor {

	int i=10;
	//Default constructor provides the default values to the object like 0, null etc. depending on the type.
	default_constructor()
	{
		System.out.println("This is default constructor and i value is : " + i);
	}
	public void methoda()
	{
		System.out.println("Method a");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		default_constructor dc = new default_constructor();
		dc.methoda();
	}
	
}
