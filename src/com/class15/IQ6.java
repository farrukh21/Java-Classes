package com.class15;

public class IQ6 {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program to finf whether a String is palindrome or not?
		 * if reverse string and original string are same--> string is palinrome
		 * mom, dad, madam, racecar, kayak, bob
		 * 
		 */

		String original="kayak";
		String reversed="";
		
		for(int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);
			
		}
	System.out.println(reversed);
	
	if(original.equals(reversed)) {
		System.out.println("String is palindrome");
		
	}else {
		System.out.println("String is not palindrome");
	}
	}

}
