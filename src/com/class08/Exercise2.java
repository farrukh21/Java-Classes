package com.class08;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String args[]) {
		for(int a=1; a<=50; a++) {
			if(a%3==0) {
				continue;
			}
			System.out.println(a);
		}
		
		Scanner c= new Scanner(System.in);
		boolean w=true;
		
		for(int a=1; a<=10; a++) {
			System.out.println("Apply for a credit card");
	       w=c.nextBoolean();
	       if(w) {
	    	   break;
	       }
	
	
	}
}
}