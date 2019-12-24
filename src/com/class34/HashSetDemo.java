package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//lets create a collection of vegies where i do not want to have duplicate
		//hset order of the elements is not preserved
		
		HashSet<String> hset=new HashSet<>();
		//storing values into hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");
		System.out.println(hset.size());
		System.out.println(hset);
		
		// they do not have any methods to retrive elements from the collection
		//.get(); .set();
	
		//iterator
		Iterator<String>it=hset.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		
		//enhanced for loop
			System.out.println("-----------------------");
			
			for(String a:hset) {
				System.out.println(a);
			}
		
		}
		
	}
}
