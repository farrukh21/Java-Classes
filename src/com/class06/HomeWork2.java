package com.class06;
import java.util.Scanner;

public class HomeWork2 {
	public static void main(String args[]) {
		Scanner a=new Scanner (System.in);
		System.out.println("Enter first number");
		double num1=a.nextDouble();
		System.out.println("Enter second number");
		double num2=a.nextDouble();
		System.out.println("eneter third number");
		double num3=a.nextDouble();
		
		if(num1>num2 && num1>num3) {
			System.out.println("The largest number is "+num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("The largest number is "+num2);
		}else if(num3>num1 && num3>num2) {
			System.out.println("The largest number is "+num3);
		}else if(num1==num2 &&num1==num3) {
			System.out.println("The numbers are equal");
		
		}
		
		
	}

}
