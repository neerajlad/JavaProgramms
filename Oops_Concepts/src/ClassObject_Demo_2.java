
public class ClassObject_Demo_2 {

	int i = 3;
	   public static void main (String [] args)
	   {
		   //int i=0;
		   //System.out.println("i:" + i);
		   
		   
		   ClassObject_Demo_2 obj1 = new ClassObject_Demo_2 ();
	      System.out.println ("obj1.i = " + obj1.i);
	      obj1.printHello ();
	      ClassObject_Demo_2 obj2 = new ClassObject_Demo_2 ();
	      obj1.i = 5;
	      System.out.println ("obj1.i = " + obj1.i);
	      obj1.printHello ();
	      System.out.println ("obj2.i = " + obj2.i);
	      obj2.printHello ();
	   }
	   void printHello ()
	   {
	      System.out.println ("Hello! i = " + i + "\n");
	   }
}
