package com.class11;
import java.util.Scanner;
public class mashq {
	


	public static void main(String[] args)
	{
		int row1=0;
		int row2=0;
		int row3=0;
		int row4=0;
		int[][] a = {
			{1,1,2}, //sum = 4
			{3,1,2}, //sum = 6
			{3,5,3}, //sum = 11
			{0,1,2}  //sum = 3
			
		};

		  for(int b=0; b<a[0].length; b++){
		    
		  row1=row1+a[0][b];
		  }
		  
		  System.out.println(row1); 
	
	for(int b=0; b<a[1].length; b++) {
		row2=row2+a[1][b];
		
	}
	System.out.println(row2);
	for(int b=0; b<a[2].length; b++) {
		row3=row3+a[2][b];
		
	}
	System.out.println(row3);
	for(int b=0; b<a[3].length; b++) {
		row4=row4+a[3][b];
		
	}
	System.out.println(row4);
	}
	
		
		
	}	

   
	

				
 
	    
	    
	    
	    
		    
		    
		    
		    
		    
		  

