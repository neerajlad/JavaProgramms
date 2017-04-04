package polymorphismPkg;

public class Overloading_Main_ChangeNoOfArgument {

	void find(int l, int b)
	 {
	  System.out.println("Area is"+(l*b)) ;
	 }
	 void find(int l, int b,int h)
	 {
	  System.out.println("Area is"+(l*b*h));
	 }
	 
	 public static void main (String[] args)
	 {
		 Overloading_Main_ChangeNoOfArgument  ar = new Overloading_Main_ChangeNoOfArgument();
		  ar.find(8,5);     //find(int l, int b) is method is called. 
		  ar.find(4,6,2);    //find(int l, int b,int h) is called.
	 }

}
