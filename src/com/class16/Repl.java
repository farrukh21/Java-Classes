package com.class16;
import java.util.Scanner;
public class Repl {



	public static void main(String[] args) {
	    Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String word = inp.nextLine();
	    //write your code below
	    char a;
	    for(int i =0; i<word.length(); i+=2){
	 a=word.charAt(i);
	      System.out.print(a);
	    }
	   
	  }
}
