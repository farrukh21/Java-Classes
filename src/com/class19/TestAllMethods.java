package com.class19;

public class TestAllMethods {
public static void main(String[] args) {
	// find the largest from 300 and 500
	// then identify if the largest number is odd
	
	AllMethods obj= new AllMethods();
	int large=obj.findLargest(300,500);
	
	boolean odd= obj.isOdd(large);
	System.out.println(odd);
	
	//call method weekdayname
	//if (tueday, wednsday, thursda saturday 
	// im learning java
	String day=obj.weekDayName(5);
	if(day.equals("Tuesday") || day.equals("Wednsday")|| day.equals("Thursday")) {
		System.out.println("Im learning Java");
	}else {
		System.out.println("I am practicing java");
	}
}
}
