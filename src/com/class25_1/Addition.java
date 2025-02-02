package com.class25_1;

public class Addition {

	/*
	 *  method overloading:
	 *  1 by passing different amount of parameters
	 */ 
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2);
	}
	/*
	 * 2 by having different types of parameters
	 */
	public void add(double num1, double num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1, double num2) {
		System.out.println(num1+num2);
	}
//	public void add(int num1, int num2) { --compiler error
//		sum=num1+num2;
//		return sum;
//	}
	public static void main(String args[]) {
		Addition obj= new Addition();
		obj.add(12,13);
		obj.add(12,13,14);
		obj.add(12.09, 12.10);
		
		String str="Hello";
		System.out.println(str.substring(3));
		System.out.println(str.codePointCount(3, 4));
	}
}
