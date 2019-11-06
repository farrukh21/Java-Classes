package com.class3;

public class RelationalOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int num1=20;
		int num2=19;
		
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("***********");
		
		double d=1.99;
		double d1=2.99;
		
		boolean b1=d<d1;
		System.out.println(b1);
		System.out.println("#############");
		
		int a=90;
		int b=30;
		//if number a is bigger than number b
		//I want to print a is larger than b
		
		if (a>b) {
			System.out.println("a is larger than b'");
		}else {
			System.out.println("a is smaller than b");
			}
		System.out.println("***************");
		
	
		
		int expectedHours=15;
		int actualHours=2;
		//if expected hours are more than actuak-> you will succeed
		//otherwise, please study more
		
		if (actualHours>expectedHours) {
			System.out.println("you will suceed");
		}else {
			System.out.println("please study more");
			System.out.println("@@@@@@@@@");
			}
		
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2;// 4.99-2=2.99
		
		// if price is more than i can afford i will not buy
		//if price uis less or matches what i can afford then i will buy tea
		if (allowedPrice>teaPrice) {
			System.out.println("I will buy");
			System.out.println("i will enjoy my tea");
		}else {
			System.out.println("i can not afford i need to study more");
			System.out.println("i will go back to study");	
		}
		System.out.println("i will keep writting some code"); //outside the braces
		
		boolean isRain=true;
		//if it is raining i will take umbrella, otherwise i go for a walk
		
		if(isRain) {
			System.out.println("I will take umbrella");
		}else {
			System.out.println(" i will go for a walk");
		}
	 } 	
	}

