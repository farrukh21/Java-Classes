package com.class08;

public class BreakandContinue {

	public static void main(String args[]) {
		for(int i=0; i<10; i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
			
		}
	System.out.println("Im outside of the loop");
	
		
	//continu- it will skip CURRENT iteration'
	
	for (int i=1; i<=5; i++) {
		if(i==3||i==4) {
			continue;
		}
			System.out.println(i);
		}
		System.out.println("im outside od the loop");
		
		
		System.out.println("***********************");
		// I want to print nums from 1 to 20 except 5,6,7
		
		for(int a=1; a<=20; a++) {
			if(a==5||a==6||a==7) {
			continue;
		}
			System.out.println(a);
		}
	}
	
	}
