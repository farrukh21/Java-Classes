package com.class15;

public class IQ4 {
	public static void main(String[] args) {
		/*
		 * how to find oout the part of the string from a String?
		 * what is substring?
		 * Find number of words in string?
		 */
		String  str="Today is very cold outside";
		String subString=str.substring(0,5);
		System.out.println(subString);
		/*
		 * Step1: split based on the space --> array of String
		 * Step2: find the length of an array
		 */
		String[]words=str.split(" ");
		System.out.println(words.length);
	}

}
