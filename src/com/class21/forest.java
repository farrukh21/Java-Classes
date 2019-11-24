package com.class21;

public class forest {
	//Create four classes: Forest, Wolf, Fox, Bear
    //Class wolf has: color, age, numberOfWolves
    //Class fox has: color, speed, numberOfFoxes
    //Class bear has: type, weight, numberOfBears
    
    //Forest has main method
    //Create different objects/instances of different classes
    //At the end, print the total for each animal.

	String color, name;
	static int numberOfWolves, numberOfFoxes, numberOfBears;
	int speed, age, weight;
	
	
	public static void main (String args[]) {
		forest wolf= new forest();
		wolf.name="Vojak";
		wolf.speed=55;
		wolf.color="grey";
		wolf.age=8;
		wolf.numberOfWolves=500;
		System.out.println("The name of the wolf is"+wolf.name+" and his  speed is " +wolf.speed+" number of wolves in this forest is "+wolf.numberOfWolves);
		
		forest fox= new forest();
		fox.name="Lisa";
		fox.color="orange";
		fox.age=5;
		fox.speed=50;
		fox.numberOfFoxes=300;
		System.out.println("The number of foxes "+fox.numberOfFoxes);
		
		forest bears= new forest();
		bears.name="Mishka";
		bears.color="brown";
		bears.speed=40;
	    bears.weight=500;
	    bears.numberOfBears=400;
		System.out.println("The number of bears "+bears.numberOfBears);
	
	}
}
