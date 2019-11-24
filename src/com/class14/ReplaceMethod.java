package com.class14;

public class ReplaceMethod {

	public static void main(String args[]) {
		//.replace
		String str="your Syntax Technologies.is your place to study";
		System.out.println(str.replace('y','i'));
		
		System.out.println("****************");
		System.out.println(str.replace("your", "My"));

		System.out.println("*********************");
		//.replaceAll
		String str2="String is a sequence of characters jjk. kgb bbvhhfjffhj";
		System.out.println(str2.replaceAll("of(.*)" ,""));
		
		System.out.println("******************");
		
		String str3="1234Hello1234^&*$^";
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^a-zA-Z^]", ""));
		
		System.out.println("**********************");
		System.out.println(str2.replaceFirst(" ", ""));
	
	
	}
	}
