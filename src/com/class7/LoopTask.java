package com.class7;

public class LoopTask {
/*Create a boolean variable workDay and assign true
 * creat int variable day and assign it to 1
 * as long as it workDay print "I need a day off" and increase day by1
 * as long as you days hits 6 you say i dont need a day off anymore
 * 
 */
	public static void main(String args[]) {
		boolean workDay=true;
		int day=1;
		
		while (workDay) {
				if(day==6) {
					System.out.println("I dont need an off day anymore");	
				 workDay=false;
				}else{
		    	   System.out.println("I  need an day off ");
		    	  
		       }
				
				day++;
   }
}
}