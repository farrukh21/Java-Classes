package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework3 {
	public static void main(String[] args) {
		/*
		 * Create an arrayList of drinks.
		 * If any drink has a letter "a" or "e" replace it with water.
		 */
		List<String> drinks= new ArrayList<>();
	
		drinks.add("cola");
		drinks.add("milk");
		drinks.add("juice");
		drinks.add("cofee");
		drinks.add("tea");
		
		drinks.set(0, "water");
		Iterator<String> it= drinks.iterator();
		
		for (int i=0;i<drinks.size();i++) {
			if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}
		}
			System.out.println(drinks);
		}
//		while(it.hasNext()) {
//			if(it.next().contains("e")||(it.next().contains("a"))) {
//				it.remove();
//			}
//		}
//		System.out.println(drinks);		
	
	
	
	}


