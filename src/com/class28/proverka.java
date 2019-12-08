package com.class28;

public class proverka {

	proverka(int a){
		System.out.println(a);
	}
}
class test extends proverka{
	test(){
		super(19);
		System.out.println("proverka2");
	}
}
class Main{
	public static void main(String args[]) {
		test obj=new test();
	}
}
