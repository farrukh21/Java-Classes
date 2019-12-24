package com.class32;




import java.util.ArrayList;
import java.util.Iterator;





public class Task {
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("Igor");
		names.add("Ihsan");
		names.add("Ahmet");
		names.add("Ali");
		names.add("Anton");
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Ihsan"));
		System.out.println(names.size());
		
		for(int i=0; i<names.size(); i++ ) {
			System.out.println(names.get(i));
			
			//2 type using enhanced for loop
			for(String name:names) {
				System.out.println(name);
				
				//3 way
				Iterator<String>it=names.iterator();
			}
		}
	}
	

}
