package com.class7;

import java.util.Scanner;

public class mashq2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("pay 5$ for coffee");
		int cof=a.nextInt();
		do {
			if(cof==5) {
				System.out.println("Enjoy your coffee");
				
			}else {
				System.out.println("Pay for your coffee");
				
		}
			cof++;
		}while(cof<=5);
		
		
		
		
		}
		
	
	}

