package com.class26;

public class Degree {

	public void deg() {
		System.out.println("I got a degree");
	}
}

 class Undergraduate extends Degree {

	 public void deg() {
		 System.out.println("I am an Undergraduat");
	 }
}
 class Graduate extends Degree{
	 public void deg() {
		 System.out.println("I am a Graduate");
	 }
 }