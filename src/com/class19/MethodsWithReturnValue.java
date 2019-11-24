package com.class19;

public class MethodsWithReturnValue {
	public static void main(String[] args) {
		/*
		 * declare a string and if String has more than 10 characters--> String is large
		 * otherwise -> String is small
		 */
		String str = "Welcome home";
		int numOfChars = str.length();
		if (numOfChars >= 10) {
			System.out.println("String is large");

		} else {
			System.out.println("String is small");
		}

		char character = str.charAt(4);
		System.out.println(character);

		// create an object where method is defined

		Recap obj = new Recap();
		obj.sum(10, 30);

		MethodsWithReturnValue obj1 = new MethodsWithReturnValue();
		int sum = obj1.sum(50, 50);
		System.out.println(sum);
		int large = obj1.findLargest(20, 40);
		System.out.println(large);
	}

//return type, method name (list of parameters)
	int sum(int num1, int num2) {
		int c = num1 + num2;
		return c;
	}

// method to return largest number
	int findLargest(int num1, int num2) {
		int largest;
		if (num1 > num2) {
			largest = num1;
		} else {
			largest = num2;
		}
		return largest;
	}
}
