package com.class11;

public class ArrayManipulation {
	public static void main(String args[]) {
		
		//Declare 2D array
		int[][] array=new int[3] [4];
		
		//1st row
		array[0][0]=44;
		array[0][1]=80;
		array[0][2]=33;
		array[0][3]=20;
		
		//2nd row
		array[1][0]=10;
		array[1][1]=5;
		array[1][2]=7;
		array[1][3]=8;
		
		//3rd row
		array [2][0]=10;
		array [2][1]=9;
		array [2][2]=70;
		array[2][3]=6;
		//Task create a 2D array of String with 2 and 3 columns
		
		
		String [][]task=new String [2][3];
		
		task[0][0]="a";
		task[0][1]="b";
		task[0][2]="f";
		
		task[1][0]="c";
		task[1][1]="d";
		task[1][2]="g";
				
System.out.println(task[1][2]);
		

	}

}
