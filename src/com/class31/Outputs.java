package com.class31;

public interface Outputs {
	public void display();
}
interface Functions extends Outputs{
	 public double adding(double firstNumber, double SecondNumber);
	 public  double substracting(double firstNumber, double SecondNumber);
	 public double multiply(double firstNumber, double SecondNumber);
	 public  double deviding(double firstNumber, double SecondNumber);
	}