package com.class38;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		division(12,0);
		division(12,2);
//      int num1=10; int num2=0;
//      int result;
//		
	}

	public static void division(int num1, int num2) {
	
		int result;
		
		try {
			result=num1/num2;
			System.out.println(result);
			Thread.sleep(5000);
//		}catch(Exception e) {
//			System.out.println("Catching all type of exception");
		}catch(ArithmeticException e) {
		  e.printStackTrace();
		}catch(InterruptedException e) {
			System.out.println("Someone intererrupted program sleep");
		}catch(Exception e) {
			System.out.println("Catching all type of exception");
		}
		System.out.println("End of my method");
	}
}
