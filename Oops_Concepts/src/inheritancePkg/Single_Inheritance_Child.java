package inheritancePkg;

class Parent
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
}

class Single_Inheritance_Child extends Parent
{
   public void methodB()
   {
     System.out.println("Child class method");
     methodA();
   }
   
   public static void main(String args[])
   {
	   Single_Inheritance_Child obj = new Single_Inheritance_Child();
     obj.methodA(); //calling super class method
     obj.methodB(); //calling local method
  }
}