package accessControlPkg;

class Pri_Class
{  
	private int data=40;  
	private void msg()
	{
		System.out.println("Hello java");
		
	}
	public void display()
	{
		System.out.println("data: " + data);
		msg(); // accessing private method
	}
}  
  
