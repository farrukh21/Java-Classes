package com.class25;

public class ConstructorOverloading {

	ConstructorOverloading(){
		System.out.println("I am non-argument constructor");
		
	}
	ConstructorOverloading(String str){
		System.out.println("I am non argument constructor");
	}
	//having different type of parameters
	ConstructorOverloading(int num){
		System.out.println("I am constructor with 1 int param");
	}
}
