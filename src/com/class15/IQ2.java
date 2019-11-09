package com.class15;

import java.util.Arrays;

public class IQ2 {

	/*
	 * Write a java program to find the second largest number in the array?
	 * maximum and minimum number in the array?
	 */
	public static void main(String[] args) {
		int[] array= {100, -90, 8787,898, 0, 1};
		// easiest way
		Arrays.sort(array);
		int min= array[0];
		int max= array[array.length-1];
		
		System.out.println(min);
		System.out.println(max);
		
		//2 way
		
		int[] myArray= {100, -90, 8787,898, 0, 1};
		int largest=myArray[0];
		int smallest=myArray[0];
		
		for(int i=0; i<myArray.length; i++) {
			
			if(myArray[i]>largest) {
				largest=myArray[i];
		}
	
			if(myArray[i]<smallest) {
				smallest=myArray[i];
			}	
			}
		System.out.println("The smallest value in the arra is" + smallest);
		System.out.println("The largest value in the array is"+ largest);
		
		//How to find second largest
		
		 int[] nums= {100, -90, 8787, 898, 0, 1};
	        
	        int lar=nums[0];
	        int secondLar=nums[0];
	        
	        for(int i=0; i<nums.length; i++) {
	            if(nums[i]>lar) {
	                secondLar=lar;
	                lar=nums[i];
	            }
	            if(nums[i]>secondLar && nums[i]<secondLar) {
	                secondLar=nums[i];
	            }
	        }
	        
	        System.out.println("The largest value in the array is: "+lar);
	        System.out.println("The second largest value in the array is: "+secondLar);
		
		}
		
}
