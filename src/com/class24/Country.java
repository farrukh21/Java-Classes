package com.class24;

public class Country {
	public String capital, name;
	
	Country(){
		System.out.println("I am non argument constructor");
	}
	Country(String countryName, String countryCapital){
		name=countryName;
		capital=countryCapital;
	}
	
	public void displayInfo() {
		System.out.println(name+" "+capital);
	}
	
	public static void main(String[] args) {
//		Country country1= new Country();
//		country1.name="usa";
//		country1.capital="Washington dc";
		
		Country country1=new Country("USA","Washington");
		Country country2=new Country("Kazakhstan","Nur Sultan");
		Country country3=new Country();
		
		
		country1.displayInfo();
		country2.displayInfo();
		country3.displayInfo();
	}

}
