package com.class04;

public class Mashq {
	public static void main(String args[]) {
	 
	 boolean diploma= true;
	 double gpa=2.8;
	 
	 
	 if (diploma) {
		 System.out.println("Congratulations");
		 if (gpa>3.5) {
			 System.out.println("You are eligible for a scholarship");
		 }else {
			 System.out.println("You should have studied harde");
		 }
	 }else {
		 System.out.println("You should get a degree");
	 }
	 
	 double mortRate= 4.2;
	 double mortPrice=100000;
	 
	 if (mortRate>4.5) {
		 System.out.println("User will not buy a house");
	 }else {
		 System.out.println("Will consider buying");
	  if (mortPrice>200000) {
		  System.out.println("User will take a loan");
	  }else {
		  System.out.println("He will pay cash");
	  }
	 
	 }
 }
}