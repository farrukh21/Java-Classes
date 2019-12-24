package com.class33;

import java.util.ArrayList;

public class Recap {
	
	public static void main(String[] args) {
		//Lets create an ArrayList to store numbers
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		
		int size=numbers.size();
		System.out.println(size);//4
		
		//add more
		numbers.add(1000);
		//remove
		numbers.remove(size-1);//3
		numbers.remove(1);
		System.out.println(numbers);
	}

}
