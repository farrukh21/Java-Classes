package com.class24_1;

import java.util.Scanner;
public class Main {
	
		  public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    char a;
		    for(int i =word.length()-1; i>=0; i--){
		     a=word.charAt(i);
		      System.out.print(a);
		    }
		  }
		    

}
