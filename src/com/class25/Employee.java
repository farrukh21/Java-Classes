package com.class25;

public class Employee {

	int salary;
	protected String employeID;
	static String companyName;
	void work() {
		System.out.println("I work in a "+companyName+" company");
	}
	void getPaid() {
		System.out.println("I get "+salary+" salary");
	}
}
