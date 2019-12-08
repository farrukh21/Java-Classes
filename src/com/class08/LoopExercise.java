package com.class08;

public class LoopExercise {

	public static void main(String args[]) {
	
		for(int i=1; i<=100; i++) {
			System.out.print(i+" ");
	   }
	    for( int i=100; i>1; i--) {
	    	System.out.println(i);

	    }
        
	    for(int i=20; i>1; i--) {
	    	System.out.println(i--);
	    }
	
	    for(int i=20; i<50; i+=2) {
	    	System.out.println(i);
	    }
	    System.out.println("*******************");
	 int sumAll=0;
	 
	 for(int i=0; i<=20; i+=5) {
		 sumAll=sumAll+i;
	 }
	System.out.println(sumAll);
	
	}
}
