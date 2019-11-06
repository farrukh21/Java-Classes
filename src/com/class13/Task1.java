package com.class13;
import java.util.Scanner;
public class Task1 {

	public static void main (String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your class day:: ");
		
		String day=scan.nextLine();
		
		if(day.trim().toLowerCase().equals("Saturday")){
			System.out.println("Saturday is your Java Class");
		   }else if (day.equalsIgnoreCase ("Sunday")) {
			   System.out.println("Sunday is your Git class");
		   }else if (day.equals("Tuesday")) {
			   System.out.println("Tuesday is your SDLC class");
		   }else if (day.contentEquals("thursday")) {
			   System.out.println("Thursday is your Manual Testing Class");
		   }else {
			   System.err.println("Invalid entry!! Please enter a valid class day");
		   }
		scan.close();
		   
			   
				
			}
		}


	

