package com.class35;

import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		
	
	HashMap <String, String> countries=new HashMap<>();
	countries.put("Tajikistan", "Dushanbe");
	countries.put("Turkey", "Istanbul");
	countries.put("Slovakia", "Bratislava");
	countries.put("Qatar", "Doha");
	countries.put("USA", "Washington DC");
	
	Set<String> k=countries.keySet();
	for(String a:k) {
		System.out.println(a);
		
	}
	Iterator <String>a=k.iterator();
	while(a.hasNext()) {
		System.out.println(a.next());
		
	}

}
}