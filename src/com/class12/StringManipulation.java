package com.class12;

public class StringManipulation {
public static void main(String[] args) {
	// There arae two ways to create to string objects.
	//String literal
	String name="John";
	System.out.println(name);
	System.out.println(name.length());
	
	//2
	//Create String with new key word
	String name1=new String("John1");
	System.out.println(name1);
	
	/*
	 * This method returnds the length of this string.
	 * The length is equal to the number
	 * of 16-bit Unicode characters in the String.
	 */
	int name1Len=name1.length();
	System.out.println("The length  of length of name1Len is =" +name1Len);

}
}
