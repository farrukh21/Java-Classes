package com.class05;

public class LogicalAnd {


	public static void main(String args[]) {
		 /*if number is between 1-10--> this number is small
		  * if number is between 10-100--this number is medium
		  * if number is between 100-1000--thi number is large
		  * any other number--is out of range
		  */
		int num=200;
		
		if(num>1 && num<10) {
			// true AND false-->false
			System.out.println("this number is small");
			
		}else if(num>=10 && num<100) {
			System.out.println("thi is medium number");
			// true AND false--> true
			
		}else if(num>=100 && num<1000) {
			System.out.println("this is large number");
		
		}else {
			System.out.println("number is out of the range");
		}
		  
	}
	
}
