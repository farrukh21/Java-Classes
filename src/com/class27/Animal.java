package com.class27;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}

}
class Monkey extends Animal{
	//can not override static methods with instance variables
	//public  void whoIam(){}
	
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}
