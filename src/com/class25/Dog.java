package com.class25;

public class Dog {
	String dogName;
	double dogWeight;
	static String dogBreed="Mutt";

	Dog(String name, String breed,double weight){
	  dogName=name;
	  dogWeight=weight;
	  dogBreed=breed;
	}
	void a(){
	System.out.println(dogName+" "+dogWeight+" "+dogBreed);
	}
	Dog(String name1, double weight1){
	dogName=name1;
	dogWeight=weight1;
	}
	void b(){
	System.out.println(dogName+" "+dogWeight);
	}
	}


