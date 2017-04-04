package static_NonStaticpkg;

class StaticMethodExample {
	
	StaticMethodExample()
	{
		System.out.println("I am constructor");
	}
	
	void NonStaticMethod() {
		System.out.println("Hello I am Non-Static");
	}

	static void StaticMethod() {
		System.out.println("Hello I am Static");
	}
	
	
	
	
//	static
//	{
//		System.out.println("I am static block");
//	}
//	
//	//Can i create multiple static Block?
//	static
//	{
//		System.out.println("I am static block - 2");
//	}
	
}

class PersonStaticMethodExample {
//	static
//	{
//		System.out.println("I am static block PersonStaticMethodExample");
//	}
//	
	public static void main(String args[]) {
		
		StaticMethodExample oa = new StaticMethodExample();
//		
//		
//		oa.NonStaticMethod(); // non static method
//		oa.StaticMethod();
//		StaticMethodExample.StaticMethod(); // static method

		
	}
	
//	static
//	{
//		System.out.println("I am ===static block PersonStaticMethodExample");
//	}
	
}
