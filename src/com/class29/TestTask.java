package com.class29;

public class TestTask {
	public static void main(String[] args) {
		javaFile obj= new javaFile();
		obj.open("Java");
		obj.close();
		obj.edit();
		
		
		WordFile obj1= new WordFile();
		obj1.open("Word");
		obj1.close();
		obj1.edit();
		
		
		PDFFile obj2= new PDFFile();
		obj2.open("PDF");
		obj2.close();
		obj2.edit();
		
	}

}
