package com.class15;

public class IQ7 {

	public static void main(String[] args) {
	/*
	 * write a program to check whether a given number is prime or not?
	 * Prime: is a number that has to meet 2 conditions:
	 * it should be diviisible by 1and by itself only
	 * 2,3,5,7,11,13,17,19
	 */
	
   //take range of numbers from 2 to 100 and all prime 
		//2,3 (2,3), 4(2,3,4), 5(2,3,4,5), 6(2,3,4,5,6)
		
		int num=11;
		boolean isPrime=true;
		for(int i=2; i<=num; i++) {
			if (num%i==0) {
				isPrime=false;
			}
		}
	if(isPrime) {
		System.out.println(num+" is not a Prime number");
	}else {
		System.out.println(num+" is a Prime number");
	}

	
	}

}
