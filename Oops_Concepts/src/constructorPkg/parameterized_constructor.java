package constructorPkg;

public class parameterized_constructor {

	int id;  
    String name;  
    //A constructor that have parameters is known as parameterized constructor
    //Parameterized constructor is used to provide different values to the distinct objects.
    parameterized_constructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    public parameterized_constructor() {
		// TODO Auto-generated constructor stub
    	id=40;
    	name="abc";
    	System.out.println("Defailt cons :" + id+" "+name);
	}
    
    void display()
    {
    	System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]){  
    	//parameterized_constructor s = new parameterized_constructor();
    	parameterized_constructor s1 = new parameterized_constructor(111,"Karan");  
    	parameterized_constructor s2 = new parameterized_constructor(222,"Aryan");
    	//parameterized_constructor s3 = new parameterized_constructor();
    s1.display();  
    s2.display();  
   }  

}
