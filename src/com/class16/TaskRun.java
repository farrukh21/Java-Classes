package com.class16;

public class TaskRun {
	public static void main(String[] args) {
		Phone phone1= new Phone();
		phone1.IOS= "Iphone 7";
		phone1.memory=8;
		phone1.display=7;
		phone1.resolution=1300;
		
		System.out.print("I want to buy a"+phone1.IOS+" with a memory of "+phone1.memory +" and  "+phone1.display+" display"+" which ");
		phone1.power();
		
		Phone phone2= new Phone();
		phone2.android="Galaxy S8";
		phone2.memory=12;
		phone2.display=10;
		
		System.out.print("He wants to buy a "+phone2.android+" with a memory of "+phone2.memory+" which ");
		phone2.camera();
		
		Phone phone3= new Phone();
		phone3.Windows= "Nokia";
		phone3.display=16;
		phone3.memory=32;
		
		System.out.println("Nobody wants "+phone3.Windows);
		System.out.println("****************************************************************************");
		
		Dog bulldog= new Dog();
		
		System.out.print("Bulldog ");
		bulldog.bark();
		bulldog.bite();
		
		
		
		
		
		
		
	}

}
