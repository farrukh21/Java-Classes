package com.class6;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("please eneter your first number");
		int num1 = a.nextInt();
		System.out.println("Please enter your second number");
		int num2 = a.nextInt();
		int num3 = 0;

		if (num1 > num2) {
			System.out.println("please enter your third number");
			num3 = a.nextInt();
			if (num1 > num3) {
				System.out.println(num1 + " is the greatest number");
			} else if (num1 < num3) {
				System.out.println(num3 + " is the gretest number");
			}
		} else if (num1 < num2) {
			System.out.println("please enter your third number");
			num3 = a.nextInt();
		    if (num2 > num3) {
			System.out.println(num2 + " is the greatest number");
		    }else if (num2 < num3) {
				System.out.println(num3 + " is the greatest number");
			}
		} else {
			System.out.println("please enter your third number");
			num3 = a.nextInt();
			if (num2==num3) {
				System.out.println("numbers are equal");
			}else {
				System.out.println(num3+" is the greatest number");
					
				}
			}
		}

	}
	
