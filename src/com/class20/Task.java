package com.class20;

public class Task {
 
	/*
	 * Create a method that will take 1 parameter as a String and return reversed String. Method should be visibly only within same package.
Create a method that will take a String and return whether String is palindrome or not. Method should be available to all classes within your projects.
Create a method that will take a string and return an array of words from that string. Method should be available only within same class.
	 */
	static String[] arrayOfWords(String sentence) {
		//String [] stringArray;
	  //  stringArray=sentence.split(" ");
		//return stringArray;
		
		return sentence.split(" ");
	}
	
	public boolean isPalindrome(String param) {
		boolean result=true;
		String reverse = reverseString(param);
		if (param.equalsIgnoreCase(reverse)) {
			result= true;
		}else {
			result= false;
		}
		return result;
	}
	String reverseString(String param){
		String result="";
		char[] charArray=param.toCharArray();
		for(int i= charArray.length-1; i>=0; i--) {
			result+=charArray[i];	
		}
			return result;
	}
	
	
public static void main (String args[]) {
Task obj= new Task();
System.out.println(obj.reverseString("farrukh"));
System.out.println(obj.isPalindrome("aziza"));

String[] strArray = Task.arrayOfWords("What a beautiful day is today!");
System.out.println("The length of the array is: " + strArray.length);

for (String word : strArray) {
	System.out.println(word);;
}
}
}