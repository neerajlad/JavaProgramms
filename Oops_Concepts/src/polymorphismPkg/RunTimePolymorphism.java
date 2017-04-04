package polymorphismPkg;

public class RunTimePolymorphism {


	
	public static void main(String[] args)
	 {
	   Game gm = new Game();
	   Cricket ck = new Cricket();
	   gm.type(); // outdoor * indoor
	   ck.type();
	   gm=ck;      //gm refers to Cricket object
	   gm.type();  //calls Cricket's version of type // outdoor
	 }

}
