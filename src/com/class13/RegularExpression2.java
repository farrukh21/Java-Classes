package com.class13;

public class RegularExpression2 {

	public static void main(String[] args) {
		String s="Today is our java class";
		System.out.println(s.replaceAll(" ", ""));
		System.out.println("*****************");
		System.out.println(s.replaceAll("\\s",""));
		
		String doc="Video provides a powerful way to help you "
				+ "prove your point. When you click Online Video,"
				+ " you can paste in the embed code for the video you "
				+ "want to add. You can also type a keyword to search "
				+ "online for the video that best fits your document.";
		
		System.out.println(doc.toLowerCase().replace("video", "Audio"));
		System.out.println(doc.replaceAll("powerful(.*)", ""));

	}
}
