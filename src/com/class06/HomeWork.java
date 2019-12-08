package com.class06;

public class HomeWork {

	public static void main(String[] args) {
		String timeOfDay=null;
		int time =25;
		
		if (time>=1 && time<=11) {
			timeOfDay="Morning";
		}else if (time>=12 && time<=15) {
			timeOfDay="Noon";	
		}else if (time>=16 && time <=20) {
			timeOfDay="Evening";
		}else if (time>20 && time<=24) {
			timeOfDay="Night";
		}else {
		System.out.println("invalid");
		}
		System.out.println("Time of the day is "+timeOfDay);
		
		if(timeOfDay.equals("Morning")){
			System.out.println("Good morning");
		}

	}

}
