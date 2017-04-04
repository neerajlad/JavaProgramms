package collectionPkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Example_Main {

	public static void main(String args[]) {

		// Generic hashmap
		// Key and Value
		// Store Unique values only and store null values, also able to store multiple null values
		// its maintains no order
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		hm.put(103, "Zara");
		hm.put(103, "Zara1");
		hm.put(100, "Amit");
		hm.put(600,null);
		hm.put(null,"test");
		hm.put(null,null);  
		
		
		System.out.println("-------------");
		
		for (Map.Entry m : hm.entrySet()) {
			System.out.println("Key:"+m.getKey() + " " + "Value:"+ m.getValue());
		}

		System.out.println("-------------");
		
		// Get a set of the entries
		Set set = hm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		
		// Display elements
		while (i.hasNext()) {
			Map.Entry me =  (Map.Entry)i.next(); // Type Casting			
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		System.out.println("-------------");
		System.out.println("102 ::::: "+hm.get(102));
		System.out.println("105 ::::: "+hm.get(105));
		
		// Second way to create HashMap
		HashMap hashmapobj = new HashMap();
        hashmapobj.put("Alive is ", "awesome");  
        hashmapobj.put("Love", "yourself"); 
        System.out.println("HashMap object output :"+hashmapobj);
        
	}
}
