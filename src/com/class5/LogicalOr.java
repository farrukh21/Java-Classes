package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		// 7 day of a week
		//if day is 2 or 4--SDLC
		//If day is 6 or 7 -- Java CLass
		// if day 1 or -- no class
		// If day =3-- review class
		int day = 6;
		// false OR false
		if(day==2 || day==4) {
		// true OR false
			System.out.println("SDLC class");
		}else if ( day==6|| day==7) {
		// false OR false --false
			System.out.println("Java Class");
		}else if (day==3) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
			
		}
		String weekDay= "Saturday";
		
		if(weekDay.equals("Tuesday")||weekDay.equals("Thursday")) {
			System.out.println("SDLC class");
		}else if (weekDay.equals("Saturday")|| weekDay.equals("Sunday")) {
			System.out.println("Java class");
		}else if(weekDay.equals("Monday")||weekDay.equals("Friday")) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
		

	}

}
