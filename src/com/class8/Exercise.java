package com.class8;

public class Exercise {

	public static void main(String[] args) {
		/*write a code to find the sum of even& odd numbers
		 * from range 1 to 20
		 * expecting 2 outputs
		 * som for odd nums=..
		 * sum of even nums=..
		 * 
		 */
		int b=0;
		int c=0;
		
		for(int a=1; a<=20; a+=2) {
			b=b+a;
		}
		 System.out.println("Sum of odd numbers "+ b);
		
		 for(int a=0; a<=20; a+=2 ) {
			 c=c+a;
		 }
	     System.out.println("Sum of even numbers"+c);
	}

}
