package com.class6;
import java.util.Scanner;

public class ClassTask {
	public static void main(String args[]) {
	Scanner age=new Scanner(System.in);
	System.out.println("eneter your month");
	int month=age.nextInt();
	String season=null;
	
	if(month==1 || month<3) {
		season="Winter";
	}else if(month==3 || month<6) {
		season="Spring";
	}else if(month==6 || month<9) {
		season="Summer";
	}else if(month==9 || month<12) {
		season="Fall";
	}else if(month==12) {
		season="Winter";
	}else {
		System.out.println("invalid month");
	}
	System.out.println("You were born in "+season);
	
	
	}

}
