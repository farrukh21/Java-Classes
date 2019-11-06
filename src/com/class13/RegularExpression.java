package com.class13;

public class RegularExpression {
//print only text not numbers
	
	public static void main(String args[]) {
		String s="1234hel45665434ol23";//Hello
		System.out.println(s.replaceAll("[0-9]", ""));//Leave only text
		System.out.println(s.replaceAll("[a-zA-Z]",""));//leave only numbers 1234123424234
		//REmove everything
		String str2="Hi@$#435436";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str2.replace("How", ""));
	}
}
