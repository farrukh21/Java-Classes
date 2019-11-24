package com.class22;

public class StaticvsNonstatic {
	static String school="Syntax";
	String name;
	char grade;
	//instance method
	void getInfo() {
		System.out.println("My name is"+name+" and i am going to "+school+" and my grade is "+ grade);
	}
	// static method
	static void getInfo1() {
		System.out.println("I am attending classes at"+school);
		//System.out.println("My name is "+name);
		//compiler will give an error
		//you CANNOT access NON static members within STATIC methods
	}

		public static void main(String args[]) {
			System.out.println(school);
			getInfo1();
		}
	
	}
	


