package com.class5;

import java.util.Scanner;

public class Exercise {

	public static void main(String args[]) {
		int day=4;
		if(day>1 || day<5) {
			System.out.println("Weekday");
		}else if(day==6 ||day==7) {
			System.out.println("Weekend");
		}else {
			System.out.println("Not a valid day");
			
		}
		System.out.println("***************");
	
	
	Scanner height= new Scanner(System.in);
	System.out.println("Enter your height");
	double feet=height.nextDouble();
	
	if(feet<5){
		System.out.println("Short");
	}else if (feet>=5 && feet<6) {
	System.out.println("Medium");
	
	}else if (feet==6 || feet<9) {
		System.out.println("Tall");
	}else {
		System.out.println("Giant");
		

		
		
	}
	
	}
	
	
}
