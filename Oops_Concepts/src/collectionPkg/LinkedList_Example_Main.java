package collectionPkg;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");
		  al.add(null);
		  
		  
		  Iterator<String> itr=al.iterator();  
		  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println("By Index: "+al.get(3));
		  System.out.println("Contains: "+al.contains("Ravikhkhk"));
		  
		  
	}

}
