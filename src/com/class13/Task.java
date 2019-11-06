package com.class13;

public class Task {
public static void main(String[] args) {
	String a="Sunday";
	
	//System.out.println(a.charAt(5)+" "+a.charAt(4)+" "+a.charAt(3));
	System.out.println(a.length());
	
	for(int i=a.length()-1; i>=0; i--) {
		System.out.print(a.charAt(i));
		
	}
	
	/*Create a String and if the String is not empty perform the following :if the 
	 * String has an odd number of characters and has 3 or more characters, print the character in the middle String.
	 * 
	 */
	String str1="Hello";
	
	int middle=str1.length()/2;
	
	if(!str1.isEmpty()) {
		if(str1.length()%2!=0 && str1.length()>=3) {
			System.out.println(str1.charAt(middle));
		}
		
	}
}
}
