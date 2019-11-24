package com.class15;

import java.util.Arrays;

public class Try {
	public static void main(String[] args) {
		int []a= {100,200,300,10,20,1000,-10};
		
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		
		int largest=a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i]>largest) {
				largest=a[i];
				
			}
			
		}
		int smallest=a[0];
		for(int j=0; j<a.length; j++)
			if(a[j]<smallest) {
				smallest=a[j];
			}
	System.out.println(largest);
	System.out.println(smallest);
	}

}
