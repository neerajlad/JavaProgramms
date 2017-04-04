package encapsulationPkg;

public class Encapsulation_Example {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		Student s=new Student();  
		Student s1=new Student(); 		
		System.out.println(s.getName());
		s.setName("Ram");  		
		System.out.println(s.getName());
		s.getName();
		s1.setName("Sita");  		
		System.out.println(s1.getName());
		System.out.println(s.getName());
	}  
}


