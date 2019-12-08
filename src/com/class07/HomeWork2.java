package com.class07;
import java.util.Scanner;
public class HomeWork2 {
/*You need to ask user to pay for coffee
 * You need to keep asking user to pay for it until entered price is equal to 5;
 * After user paid then say "Enjoy your coffee!
 */
    public static void main(String args[]) {
    	Scanner a=new Scanner(System.in);
    	System.out.println("Please ensert 1$ banknotes");
    	int coffee=a.nextInt();
    	boolean cof=true;
    	
    	while(cof) {
    		if(coffee==5) {
    			System.out.println("enjoy your coffee");
    			cof=false;
    		}else {
    			System.out.println("pay for coffee "+ (5-coffee)+" $ more");
    		}
    	coffee++;
    	}
    	System.out.println("--------------------------------------");
    }
}
