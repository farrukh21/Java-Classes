package com.class29;

public abstract class File {

	void open(String b) {

		System.out.println("To open "+ b);
	}
	void edit() {
		System.out.println("In order to edit you need notepad");
		

	}
	public abstract void close() ;
}
class javaFile extends File{

	@Override
	public void close() {
		System.out.println("In order to close you ned to alt + f4");
		
	}
}
class WordFile extends File{

	@Override
	public void close() {
		System.out.println("In order to close WordFile you need to click on X on top right corner");
		
	}
}
class PDFFile extends File{

	@Override
	public void close() {
		System.out.println("In order to close you need to click X");
		
	}
	
}
