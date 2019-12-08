package com.class06;
import java.util.Scanner;

public class DoItAtHome {
	/*
	 * ask user to enter boolean value for sale
	* if no sale --> I am not shopping
	* if sale --> check the price of the item
	* based on the amount we will have to calculate the price after discount
	* if price < 20 --> apply 10%
	* if price between 20-100 --> 20%
	* if between 100-500--> 30 %
	* anything --> 50 % 
	* After discount ___ the price of the item reduce from __ to ___
	*/
	

	public static void main(String args[]) {
	Scanner a= new Scanner (System.in);
	System.out.println("Is there a sale for this item?");
	boolean sale=a.nextBoolean();
	double price=0.0;
	double discount=0.0;
	double FinalPrice=0.0;
	
	if(!sale) {
		System.out.println("Im not going to buy this item");
	}else {
		System.out.println("how much is the price of the item?");
		price=a.nextDouble();
		if (price<20) {
			discount=price*0.1; 
			FinalPrice=price-discount;
		}else if(price>=20 || price<=100) {
			discount=price*0.2;
			FinalPrice=price-discount;
		}else if(price>100|| price<=500) {
			discount=price*0.3;
			FinalPrice=price-discount;
		}else if(price<500) {
			discount=price*0.5;
			FinalPrice=price-discount;
		}else {
			System.out.println("invalid");
		}
		System.out.println("Ater discount "+discount+" the price of the item reduce from "+price+" to "+FinalPrice);
	}
	
	
	}
}
		
	


