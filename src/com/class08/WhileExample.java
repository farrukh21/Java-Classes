package com.class08;
import java.util.Scanner;
public class WhileExample {
  
	public static void main(String args[]) {
	     /*lets ask user to enter if it is raining or not (true or false)
	      * as long as there is no rain lets tell user to take an umbrella
	      * as soon as there is no rain--> you can go to the park
	      */
		Scanner scan;
		boolean isRain;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("Is it raining?");
			isRain=scan.nextBoolean();
		}while(isRain);
		System.out.println("Go to the park");
	}
}
