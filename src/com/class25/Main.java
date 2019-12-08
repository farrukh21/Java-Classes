package com.class25;

import java.util.Scanner;
class Main {
	
final void reverseString(String a){
  char [] charArray=a.toCharArray();
  for(int i=charArray.length-1;i>=0; i--){
	  System.out.print(charArray[i]);
    
  }
}
public static void main(String args[]) {
	Scanner b= new Scanner(System.in);
	String a=b.nextLine();
	Main obj= new Main();
	obj.reverseString(a);
	
}
  
}
