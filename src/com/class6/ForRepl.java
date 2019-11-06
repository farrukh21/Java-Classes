package com.class6;

import java.util.Scanner;

public class ForRepl {



	public static void main(String args[]){
	    Scanner a=new Scanner(System.in);
	    String gender=a.nextLine();
	    int age=a.nextInt();
	    if(age>25){
	      if(gender.equals("M")){
	      System.out.println("Man");
	      }if(gender.equals("F")){
	      System.out.println("Woman");
	      }
	    }else if(age<25){
	      if(gender.equals("M")){
	        System.out.println("Boy");
	      }if(gender.equals("F")){
	       System.out.println("Girl");
	      }
	    }
	    
	    
	}
}
  
