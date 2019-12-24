package com.class33;

import java.util.ArrayList;
import java.util.Iterator;



public class Homework {
	public static void main(String[] args) {
		/*
		 * Create an arrayList of cars retrieve all the values useing 3 different ways
		 */
		
		ArrayList<String> car= new ArrayList<>();
		car.add("Nissan");
		car.add("Toyota");
		car.add("Honda");
		car.add("BMW");
		
		for(int i=0; car.size()-1<=0; i++) {
			System.out.println(car.get(i));
		}
		for(String a:car) {
			System.out.println(a);
			
		}
		Iterator<String> it=car.iterator();
		while(it.hasNext());
		System.out.println(it.next());
	}

}
