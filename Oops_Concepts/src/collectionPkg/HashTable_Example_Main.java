package collectionPkg;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTable_Example_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		hm.put(103,"Rahul");  
		hm.put(100,"Amit");  
		hm.put(102,"Ravi");  
		hm.put(101,"Vijay1");  
		hm.put(101,"Vijay");  
	//	hm.put(600,null);
	//	hm.put(null,"test");
	//	hm.put(null,null);    
//		
		System.out.println("-------------");
		
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		
		  System.out.println("-------------");
		  
		  System.out.println("Key 100: "+hm.get(100));
		  
		  Hashtable ht = new Hashtable();
		  ht.put("1", "Ria");
		  ht.put(1, 100);
		  
		  
		  System.out.println(ht);
		  
		  System.out.println(ht.get(1));
		  System.out.println(ht.get("1"));
	}

}
