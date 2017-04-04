package collectionPkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class ArrayList_Example_Main {

	public static void main(String args[]){  

		// create an array list
		//ArrayList al = new ArrayList();
		LinkedList al=new LinkedList();
		System.out.println("Initial size of al: " + al.size());

		
		// add elements to the array list
		al.add("C");		
		al.add("A");
		al.add("E");
		al.add(10);
		al.add(2);
		al.add("F");
		System.out.println("Contents of al: " + al);
		al.add(1, "jhggj");
		boolean b = al.add(10);
		if(b==true)
		{
			System.out.println("added successfull");
		}
		else
		{
			System.out.println("Not added");
		}
		// Use iterator to display contents of al
	      System.out.print("--Original contents of al: ");
	      Iterator itr = al.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.println("value:" + element + " ");
	      }
	      System.out.println();
	      
	  
		System.out.println("Size of al after additions: " + al.size());

		// display the array list
		System.out.println("Contents of al: " + al);
		// Remove elements from the array list
		al.remove("F");
		al.remove(2);
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al: " + al);
		

		System.out.println("Removing all elements");
		al.removeAll(al);
		System.out.println("Contents of al: " + al);

		
	}
}
