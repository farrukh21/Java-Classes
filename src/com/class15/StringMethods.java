package com.class15;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java classes at Syntax are awesome";
		str.replace("awesome", "great");
		System.out.println(str);
		str=str.replace("Git", "SDLC");
		System.out.println(str);
		
		//replaceAll-->specify regular expression
		//lets remove all special characters
		str=str.replaceAll("[^A-Za-z0-9]","");
		System.out.println(str);
		
		//split
		
		String str1="Java classes at Syntax are awesome";
		str1.split("c");
		String[] array=str1.split("a");
		System.out.println(array.length);
	
	}

}
