package com.class23;

public class Task2 {
	/*Write a java program of Class Students that takes students name and 3 subject grades.
	 *  Inside your class also have a method to Calculate Average Grade. 
	 *  Test Student class for 5 different students with different marks.
	 *  Your program should print an average mark of each students name.
	 * 
	 */
Task2 (String name, int a, int b, int c) {
	int average= ( a+ b+ c)/3;
	System.out.println(name+" average mark is "+average);
}
}
