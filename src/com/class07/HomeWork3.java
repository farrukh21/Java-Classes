package com.class07;
import java.util.Scanner;
public class HomeWork3 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int price1;
		System.out.println("Please pay for your coffee");
		price1=scan.nextInt();
		while(price1!=5) {
			System.out.println("Please pay for your coffee");
			price1=scan.nextInt();
		}
		System.out.println("Enjoy your coffee");

	}

}
