package com.class15;

public class StringManipulation {
	public static void main(String args[]) {
		//2 ways to create a String 
		//First way using String literal
		String str="Hello";
		//Second way using new keyword - create a String object
		String str1= new String("hello");
		System.out.println(str);
		System.out.println(str1);
		
		int length=str.length();
		System.out.println(length);
		//case conversion methods/ functions
		
		str=str.toLowerCase(); //hello
		System.out.println(str);//hello
		
		//verify if the string is Empty
		String myString="";
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
		String myString1=null;//no value at all
		System.out.println(myString1.isEmpty());
		
		// how to verify existence of characters in the string
		
		String a="Good evening students";
		boolean exist=a.contains("student");
		System.out.println(exist);
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("Student"));

		
	}

}
