package com.class9;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner a= new Scanner(System.in); 
		System.out.println("Enter your starting point");
		int start=a.nextInt();
		System.out.println("Enter your ending point");
		int end=a.nextInt();
		int even=0;
		int odd=0;
		
		for(int i=start; i<=end; i++) {
			if(i%2==0) {
				even=even+i;
			}else {
				odd=odd+i;
			}
		}
		System.out.println("Sum of even number is "+even);
		System.out.println("Sum of odd number is "+odd);
	}
	
}