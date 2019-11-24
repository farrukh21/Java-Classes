package com.class24;

public class ThisWithConstructor {

	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str){
		this();// used to call current class constructor
		System.out.println("I am constructor its 1  String paramenter");
	}
	ThisWithConstructor(String str, String str1){
		this(str);
		System.out.println("I am a constructor with 2 params");
	}
	public static void main(String args[]) {
		ThisWithConstructor obj= new ThisWithConstructor("Hello");
		// can we execute 2 constructor when creating an Object
		// yes - it can be achieved using this()
		System.out.println("-------------------------------------------");
		ThisWithConstructor obj1= new ThisWithConstructor("Hello", "Bye");
	}
}
