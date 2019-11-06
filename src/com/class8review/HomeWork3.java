package com.class8review;

import java.util.Scanner;

public class HomeWork3 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		do {
			if (a <= 3) {
				System.out.println("Pay for your candy");
			} a++;
		} while (a < 3);
		System.out.println("Enjoy your candy");
	}
}
