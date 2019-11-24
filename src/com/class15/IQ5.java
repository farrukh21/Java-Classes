package com.class15;

public class IQ5 {

	public static void main(String[] args) {
		String given="Welcome to the Java class";
		/*
		 * to reverse String
		 * split();
		 * Step1: use for loop and use decrement to print values
		 */
		
		// reversing a string word by word
		String reversed="";
		String [] str= given.split("\\s");
		for(int j=str.length-1; j>=0; j--) {
			reversed=reversed+str[j]+" ";
		}
		System.out.println(reversed);
		
		// write a java program to reverse String?
		//toCharArray(); charAt();
		String given1="Today is Java Class";
		
		char[] charArray=given1.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}

	}

}
