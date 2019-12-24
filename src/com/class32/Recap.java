package com.class32;

public class Recap {
	public static void main(String[] args) {
		// to store single value
		int num=10;
		
		//to store multiple values 
		int[] array= {10,20,30};
		
		int[] arr= new int[3];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		System.out.println(arr[2]);
		// to retrieve all values 1 by 1
		// we are using enhanced loop
		for(int i:arr) {
			System.out.println(i);
			
		// for loop
			for(int a=0; a<arr.length; a++) {
				System.out.println(arr[a]);
				
			}
			
			// we can store non primitive types: Objects
		}
	}
class Fruit{
	
}
class Apple extends Fruit{
	
}
}
