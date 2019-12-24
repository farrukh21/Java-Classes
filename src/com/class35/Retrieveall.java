package com.class35;

import java.util.*;

public class Retrieveall {

	public static void main(String[] args) {
		//Create a map of a person(name, lastname, adress, city, state)
		
		Map<String, String>personMap=new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("Last", "Yildiz");
		personMap.put("Adress", "123Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");
		
		System.out.println(personMap);
		//how to retrieve a specific value?
		String value=personMap.get("State");
		System.out.println(value);
		
		//how to retrieve all the keys and values
		System.out.println("-__------------------Printing all keys___________________");
		Set<String> keys=personMap.keySet();
		
		for(String key:keys) {
			System.out.println(key+":"+personMap.get(key));///////////////////////
			
			System.out.println("----------------------------");
		}
		Iterator<String> keysIterator=keys.iterator();
		while(keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
		}
		System.out.println("------------------printing all values---------------");
		Collection<String>values=personMap.values();
		
		for(String val:values) {
			System.out.println(val);
		}
		Iterator<String> valuesIterator=values.iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}
		//how can i retrieve and print values key: value using iterator
		Iterator<String> keysIterator1=keys.iterator();
		while(keysIterator.hasNext()) {
			String mapKey=keysIterator1.next();
			String mapValue=personMap.get(mapKey);
			System.out.println(mapKey+" "+mapValue);
		}
	}
}
