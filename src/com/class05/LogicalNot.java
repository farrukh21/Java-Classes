package com.class05;

public class LogicalNot {

	public static void main(String args[]) {
		boolean b1=!true;
		boolean b2=!false;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic= true;
		
		if(!traffic) {//using ! we are reverting condition
			System.out.println("on time");
		}else {
			System.out.println("late");
		}
	
		boolean isRain=false;
		
		if(!isRain) {
			System.out.println("take an umbrella");
		}else {
			System.out.println("Do not take an umbrella");
			
		}
	//lets compare 2 number using not Operator
		int num1=10;
		int num3=11;
		
		if (num1==num3) {
			System.out.println("Numbers ae equal");
		}else {
			System.out.println("Number are not equal");
		}
		
		if(!(num1==num3)) {
			System.out.println("Numbers are not equal");
		}else {
			System.out.println("Numbers are equal");		
		}
		
		//if name is not mary or anna then your are not my sister
		String name="Mary";
		String name2="Anna";
		
		// true and false--! makes it false
		if (!(name.equals("Mary")||name2.contentEquals("July"))) {
			System.out.println("You are my sister");
		}else {
			System.out.println("You are not my sister");
		}
		
		
		
		
	
	
	
	}
}
