package com.class07;

import java.util.Scanner;

public class Mashq {

	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		System.out.println("Pay 5$ for your cofee");
		int b = a.nextInt();
		while(b<5) {
			System.out.println("Pay for your coffee");
			b++;
		}
		System.out.println("Enjoy your coffee");
		
	}
}