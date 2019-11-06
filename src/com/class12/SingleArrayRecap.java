package com.class12;

public class SingleArrayRecap {
public static void main (String args[]) {
	int [] array1=new int[4];
	array1[0]=12;
	array1[1]=13;
	array1[2]=14;
	
	System.out.println(array1[0]);
	int sum1=0;
	for (int i=0; i<array1.length; i++) {
		sum1=sum1+array1[i];
		
		System.out.println(array1[i]);
	}
	System.out.println(sum1);
	System.out.println("---------------------------------");
	for(int i:array1) {
		System.out.println(i);
	}
	
}
}
