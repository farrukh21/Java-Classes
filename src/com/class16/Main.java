package com.class16;

public class Main {
	String Color, Make;
	  int Year;
	  
	  public static void main (String args[]){
	     Main car=new Main();
	     car.Color="Black";
	     car.Make="BMW";
	     car.Year=2019;
	     
	     Main car2= new Main();
	     car2.Color="White";
	     car2.Make="Toyota";
	     car2.Year=2018;
	     
	     System.out.println("Car color is "+car.Color+" and car model year is "+car.Year+" and car name is "+car.Make);
	     System.out.println("Car color is "+car2.Color+" and car model year is "+car2.Year+" and car name is "+car2.Make); 
	  }
	  

	}

