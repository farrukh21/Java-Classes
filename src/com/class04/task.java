package com.class04;

import java.util.Scanner;

public class task {
public static void main(String args[]) {
	
	Scanner age= new Scanner(System.in);
	System.out.println(" what is your age?");
	int a=age.nextInt();
	
	if(a<18) {
		System.out.println("You will get a permit");
	}else {
		System.out.println("You can get a driving license");
		
		
		
			System.out.println("**************");
		}
		
	 Scanner city= new Scanner(System.in);
     System.out.println("enter your city");
     String shahr=city.nextLine();
     
     Scanner degree= new Scanner (System.in);
     System.out.println("Enter degree");
     
     int daraja=degree.nextInt();
     System.out.println(daraja*9/5+32+" your degree in Fahrenaiet");
	}
   
}
