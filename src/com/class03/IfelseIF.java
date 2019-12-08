package com.class03;

public class IfelseIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 100;
		if (num1 > num2) {
			System.out.println("Num1 is larger than num2");
		} else if (num1 == num2) {
			System.out.println("num1 is eqaual to num2");
		} else {
			System.out.println("num1 is smaller than num2");
		}

		int day = 6;
		if (day == 1) {
			System.out.println("Today is Monday. Ihave to go to work");
		} else if (day == 2) {
			System.out.println("Today is Tuesday. SDLC class");
		} else if (day == 3) {
			System.out.println("Today is wednsday");
		} else if (day == 4) {
			System.out.println("Today is Thursday");
		} else if (day == 5) {
			System.out.println("Today is Friday");
		} else if (day == 6) {
			System.out.println("Today is Saturday");
		} else if (day == 7) {
			System.out.println("Today is Sunday");
		} else {
			System.out.println(" id ont know this day");
			//ctrl+shft+f-->to make everything tidy 
		}

	}

}
