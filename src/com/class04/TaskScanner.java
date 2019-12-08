package com.class04;
import java.util.Scanner;
public class TaskScanner {
	public static void main (String args[]) {
		Scanner amount= new Scanner(System.in);
		System.out.println("Amount of loan needed");
		int loan=amount.nextInt();
		
		if(loan<200000) {
			System.out.println("i will lend money");
		}else {
			System.out.println("I will reject the client");
		}
				
	
		System.out.println("*****************************");
	}
	
	{
	
	}

}
