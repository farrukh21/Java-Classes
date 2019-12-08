package com.class05;

import java.util.Scanner;//(control+shoft+o)

public class LogicalAndScanner {

	public static void main(String args[]) {
		/*ask user to enter age 
		 * if age is from 1 to 3-- you are a baby
		 * if age from 3-5-->you are a toddler
		 * if age 
		 * 
		 */
	Scanner a= new Scanner(System.in);
	System.out.println("Enter you age");
	int b=a.nextInt();
	
	String human;
	
	if(b>=1 && b<=3) {
		//System.out.println("You are a baby");
		human="baby";
	}else if(b>=3&&b<=5) {
		//System.out.println("You are a toddler");
		human="toddler";
	}else if(b>=5 && b<=12) {
		//System.out.println("You are a kid");
		human="kid";
	}else if(b>=12 && b<=19) {
		//System.out.println("You are a teenager");
		human="teenager";
	}else if(b>20) {
		//System.out.println("You are an adult");
		human="adult";
	}else {
    //System.out.println("Invalid age");
		human="uknown";
    
	}
	
		
	}
}
