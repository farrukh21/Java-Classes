package com.class10;

public class Task {
    public static void main(String[] args) {
		char[] grades=new char[4];
		char[] grads= {'A','B','C','D'};

		String[] animals= {"Cat", "Dog", "Cow","Snake", "Elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.println(animals[i]+" ");
		}
		//create an array to store 5 double values, print all in 1 line 
		
		System.out.println("---------------------------");
		
		double[] num= {1.2, 2.2, 3.2, 4.2, 5.2};
		int a=num.length;

		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
			
		}
    }
}
