package com.class24;

public class Task {
	String make, country;

	private Task(String carMake, String carMan) {
		carMake= make;
		carMan= country;
		System.out.println("This is private constructor");
	}

	protected Task() {

		System.out.println("This is protected constructor");
	}
	Task(String phone){
		System.out.println("Default constructor");;

	}
	public Task (char a) {
		System.out.println("I am a public constructor");
	}

public static void main (String args[]) {
	Task mm= new Task('F');
	Task a= new Task("Huawei");
	Task b=new Task("bmw", "germany");
	Task c = new Task();
}
}


