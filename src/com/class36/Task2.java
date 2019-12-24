package com.class36;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
	public static void main(String[] args) {
		String capital = "paris";

		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("Paris", 5);
		map.put("Moscow", 6);
		map.put("Washington", 10);
		map.put("Doha", 4);

		Set<Entry<String, Integer>> a = map.entrySet();

		Iterator<Entry<String, Integer>> it = a.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> singleEntry = it.next();
	if (singleEntry.getValue()< 7) {
	    // a.remove(singleEntry.getValue());
	     System.out.println(singleEntry);
	}
			
			

			// if(singleEntry.getValue()>7) {
			// it.remove();
		}

	}

}
