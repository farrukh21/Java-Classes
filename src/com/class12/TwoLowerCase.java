package com.class12;

public class TwoLowerCase {
public static void main(String[] args) {
	String str1="Hello world";
	System.out.println("Before: " + str1);
		String	newValOfstr1=str1.toLowerCase();
		System.out.println("After "+ newValOfstr1);
		System.out.println("---------------------------------------");
		
		//.equals()
		String str2="HELLO WORLD";
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		//.equalsIgnoreCase();
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("************************");
		
		/*
		 * to UpperCase();
		 * This method converts all of the characters in Upper case
		 */


		String s3="Farrukh";
		s3=s3.toUpperCase();
		System.out.println(s3);
}
}
