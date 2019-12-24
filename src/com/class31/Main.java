package com.class31;

public class Main implements Functions {

	@Override
	public void display() {
	System.out.println("Result is ::: 120.0");
	System.out.println("Result is ::: 80.0");
	System.out.println("Result is ::: 2000.0");
	System.out.println("Result is ::: 5.0");
		
	}

	@Override
	public double adding(double firstNumber, double SecondNumber) {
		double a=firstNumber+SecondNumber;
		return a;
	}

	@Override
	public double substracting(double firstNumber, double SecondNumber) {
		double b=firstNumber-SecondNumber;
		return b;
	}

	@Override
	public double multiply(double firstNumber, double SecondNumber) {
		 double c=firstNumber*SecondNumber;
		return c;
	}

	@Override
	public double deviding(double firstNumber, double SecondNumber) {
		double d=firstNumber/SecondNumber;
		return d;
	}

	public static void main(String[] args) {
		Main pp=new Main();
		pp.adding(20.5, 10.0);
		pp.display();
	}
}
