package com.class19;


public class main {
	  String makeThreeSubstr(String a, int b, int c){
		 
		   String d=a.substring(b,c)+a.substring(b,c)+a.substring(b,c);
		    System.out.println(d);
		    return d;
		  }
		 
		
		public static void main (String args[]){
		 main obj= new main();
		obj.makeThreeSubstr("hello", 0, 2); 
		 
		}
	}

