package com.class32;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String>arrayList=new ArrayList<>();
		//to store values inside your collection
		arrayList.add("John");
		arrayList.add("Jane");
		arrayList.add("Jack");
		
		// to retrieve the value from arrayList
		System.out.println(arrayList.get(1));
		
		//add more values
		arrayList.add("James");
		arrayList.add("John");
		arrayList.add("Jane");
		
		//how many elements inside the arrayList?
				int size= arrayList.size();
		System.out.println(size);
		
//		creating an object of an Array list that will hold numeric values
		ArrayList<Integer>numArrList=new ArrayList<>();
		numArrList.add(100);
		numArrList.add(200);
		numArrList.add(300);
		
		System.out.println(numArrList.get(2));
		for(int num=0; num<numArrList.size(); num++) {
			System.out.println(numArrList.get(num));
		}
		for(int i:numArrList) {
			System.out.println(i);
		}
		
	}

}
