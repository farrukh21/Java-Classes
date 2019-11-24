package com.class19;

public class Recap {

	void sum(int num1, int num2) {
		int c=num1+num2;
	System.out.println("The sum of two number is = "+c);
	}
	void sayHello(int times) {
		for(int i=0; i<times; i++) {
			System.out.println("Hello");
		}
	}
	// create method to say something # number of timses
	void saySomething(String word, int times) {
		for(int i=0; i<times; i++) {
			System.out.println(word);
		}
	}
public static void main(String[] args) {
	Recap obj=new Recap();
	obj.sum(10, 20);
	obj.sayHello(10);
	obj.saySomething("qalay", 3);
	
}
}
