package com.class27;
  
public class FinalKeword {
	public final String str="Hello";
	
	public static void main(String args[]) {
		String str= "I am awesome";
		str="I am cool";
		System.out.println(str);
		
		final String  finalString="Java is easy";
		//finalString="Java is hard";
		
		final int age=120;
		//age=100;
	}

}
