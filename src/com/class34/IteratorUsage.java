package com.class34;

import java.util.*;

public class IteratorUsage {

	public static void main(String[] args) {
		List<String> stringList=new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ak");
		stringList.add("Salim");
		stringList.add("Ak");
		stringList.add("Salim");
		
		//remove names that are shorter that 4 character
		stringList.remove(2);
		System.out.println(stringList);
		//remove elelment using for Loop
		for(int i=0; i< stringList.size(); i++) {
			if(stringList.get(i).length()<=4) {
				stringList.remove(i);
			}
		}
		System.out.println(stringList);
	}
}
