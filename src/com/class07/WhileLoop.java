package com.class07;

public class WhileLoop {

	public static void main(String args[]) {

int time=8;


 // if (time<12){//condition is true
	//System.out.println("Good morning");//code executes infinetely--> infinite loop
	



   while (time<12){//condition is true
	System.out.println("Good morning");//code executes infinetely--> infinite loop
	time++;
	
}
     //i want to print good morning 5 times
    
   int i=1;
   
   while(i<6) {
	   System.out.println("Good aftrenoon");
	   i++;
   }
   System.out.println("-----------------");
   //I want to print all even numbers from 1 to 	
   //1 way - increment value by 2
   int z=2;
   { 
   //while(z<=20) {
	//   System.out.println(z);
   }
   //2 way using modulus
   
   int q=1;
   while(q<=20) {
	   if(q%2==0) {
		   System.out.println(q);
	   }
   }
	}
}
