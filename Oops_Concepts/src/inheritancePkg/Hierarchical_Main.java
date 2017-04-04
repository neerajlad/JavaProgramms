package inheritancePkg;

import constructorPkg.default_constructor;

class A
{
  public void methodA()
  {
     System.out.println("method of Class A");
  }
}
class B extends A
{
  public void methodB()
  {
     System.out.println("method of Class B");
     //methodA();
  }
}
class C extends A
{
 public void methodC()
 {
 System.out.println("method of Class C");
 }
}
class D extends A
{
  public void methodD()
  {
     System.out.println("method of Class D");
//     methodA();
  }
}
class Hierarchical_Main extends A
{
  public void methodB()
  {
     System.out.println("method of Main Class");
     methodA();
  }
  
  public static void main(String args[])
  {
     B obj1 = new B();
     C obj2 = new C();
     D obj3 = new D();
     obj1.methodA();
     obj2.methodA();
     obj3.methodA();
     obj1.methodB();
     
  }
}