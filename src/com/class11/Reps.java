package com.class11;
import java.util.Scanner;
public class Reps {


	  public static void main(String args[]){
		    

		
		  Scanner a= new Scanner(System.in);
		 
		  int [] b=new int[5];
		  for(int i=0; i<b.length; i++){
		    b[i]=a.nextInt();
		  }
	  
		  for(int e=4; e>=0; e--) {
			  System.out.println(b[e]);
			  
		  }
	  }
}