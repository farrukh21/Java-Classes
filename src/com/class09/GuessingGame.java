package com.class09;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Guess a number from 0-20");
		int c;
		c=scan.nextInt();
		while (c!=13) {
			if(c<=12) {
				System.out.println("The number you entered is too low");
				System.out.println("Keep guessing");
		
				c=scan.nextInt();
				
			}else if(c>13) {
				System.out.println("Number you entered is too high");
				System.out.println("Keep guessing");
				c=scan.nextInt();
				
			}
		}
		System.out.println("Congratulations you got it!");
			}
	}

