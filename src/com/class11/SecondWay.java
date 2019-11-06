package com.class11;

public class SecondWay {

	public static void main(String args[]) {
		int [][] numbers= {
				{8,7,5,3,8},
				{1,5,6,4,9,8},
				{3,6,8,0,7}
		};

		System.out.println("The numbers of Rows are:="+numbers.length);
		
		//to identify the numbers of columns/elements
		System.out.println("The numbers of colums are:="+ numbers[0].length);
		
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
		System.out.println();
		}
		}
	}

