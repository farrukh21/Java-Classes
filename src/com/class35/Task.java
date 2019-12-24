package com.class35;

import java.util.HashMap;

public class Task {
	public static void main(String[] args) {
		
	HashMap<Integer, String> buil= new HashMap<>();
	buil.put(1, "Google");
	buil.put(2, "Syntax");
	buil.put(3, "Oracle");
	buil.put(4, "Apple");
	buil.put(5, "Samsung");
	buil.put(6, "Google");
	buil.put(1, "Asus");
	
	int a=buil.size();
	System.out.println(a);
	buil.put(4, "Google");
	buil.remove(7);
	System.out.println(buil);
	

}
}