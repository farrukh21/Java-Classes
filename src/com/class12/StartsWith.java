package com.class12;

public class StartsWith {
	public static void main(String[] args) {
		/*
		 * This method tests if a string starts with the
		 * specified prefix beginning
		 */
	String str2="It is very hot in th class";
	System.out.println("");
	
	/*
	 * this method checks whether a string is empty or not.
	 * This method returns true if the given string
	 * is empty, else it returns false.
	 */
	String str="";
	System.out.println("Is this string empty= "+ str.isEmpty());
	String st1="hello";
	System.out.println("Is this  string empty= "+st1.isEmpty());
	
	if(!str.isEmpty()) {
		System.out.println("This is not empty");
	}else {
		System.out.println("This is empty");
	}
	
	String sentece="each day is a promise to brighten up th day,\nBut first you must..";
			System.out.println(sentece);
	
	}

}
