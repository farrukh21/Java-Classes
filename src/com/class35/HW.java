package com.class35;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(3456, "Mac Laptop");
		map.put(6746, "HP Printer");
		map.put(3468, "Dell Screen");
		map.put(8753, "Samsung TV");
		map.put(1765, "Sony Camera");
		
		//Retreiving all keys
		Set<Integer>keys=map.keySet();
		for(Integer a:keys) {
			System.out.println(a);
		}
		Set<Entry<Integer, String>>entry=map.entrySet();
		for(Entry<Integer,String>entry1:entry) {
			System.out.println(entry1.getKey()+"-->"+entry1.getValue());
			//System.out.println(entry1);
			
		}
//		Iterator<Map.Entry<Integer, String>> it=map.entrySet().iterator();
//		while(it.hasNext()) {
//			Map.Entry<String, Integer>entry2=it.next();
//		}
		
	}

}
