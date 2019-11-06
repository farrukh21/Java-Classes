package com.class11;

public class Task3 {

	public static void main(String[] args) {

		String[] countries = {"Tajikistan", "Canada", "USA","Russia"};
		
		for(String getCountry:countries) {
			if(getCountry.equals("USA")) {
				System.out.println("The capital of USA is Washington");
			}
		
			for(int i=0; i<countries.length; i++) {
				if(getCountry.equals("Canada")) {
					System.out.println("The capital of Canada is Toronto");
				}
			}
		}
	}

}
