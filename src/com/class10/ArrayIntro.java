package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
	 
		int a;
		a=10;
		
		int a1=10;
		//1 way
		int[] b; //declare an array--> prefered way
		int c[];

		b=new int[4];   
		
		int[] array= new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		//access value from an array
		System.out.println(array[2]);
		
		//lets create an array that will store classes we have
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="GIT";
		// Today we have a Java class
		System.out.println("Today we have a " +classes[0]+" class");
		
		int[] nums= new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[3]=3;
		//how we can change 1 to 100
				nums[0]=100;
				System.out.println(nums[0]);
				System.out.println(nums[0]+nums[2]);// 100+3
				// The size of an array is fixed!
				
				String names[]=new String[3];
				names[0]="Diana";
				names[1]="Seda";
				names[2]="Jaime";
				//names[3]="Olga"; during the runtime we will get an exception
				//ArrayIndexOutOfBoundsException
				
				int[] numbers= new int[4];
				numbers[1]=100;
				numbers[3]=200;
				
				
				
	}

}
