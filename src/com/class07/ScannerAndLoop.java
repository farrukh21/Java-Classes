package com.class07;
import java.util.Scanner;
public class ScannerAndLoop {

	public static void main(String[] args) {
		/*ask user to enter name 5 times
		 * and our should be "Good afternoon____"
		 */
	Scanner a=new Scanner(System.in);
	int i=1;
	while(i<=5) {
	System.out.println("Please enter your name");
	
	String name=a.nextLine();
	
	System.out.println("Good afternoon "+name);
    i++;
	}
	}

}
