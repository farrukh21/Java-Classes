package com.class11;

public class SumOfColumns {

	public static void main(String[] args)
	{
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2, 2},
			{1,-2, 3,-4}
		};
		int sum=0;

		  for(int i=0; i<a.length; i++){ //a[0].length in case of row
		  sum=sum+a[i][1];
		}
		System.out.println(sum);
		
//   should print -9
	
		}
}
