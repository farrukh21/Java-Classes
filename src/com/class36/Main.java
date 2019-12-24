package com.class36;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
	

	List<Map<String, Object>> dataList=new ArrayList<>();
	Map<String, Object> appleMap=new TreeMap<>();
	appleMap.put("Items","Apple");
	appleMap.put("Price",20.00);
	appleMap.put("Quantity",10);
	

	dataList.add(appleMap);
	
	
	Map<String, Object>orangeMap=new HashMap<>();
	orangeMap.put("Items", "Orange");
	orangeMap.put("Price", 21.99);
	orangeMap.put("Quantity", 10);
	
	dataList.add(orangeMap);
	
	System.out.println(dataList);
//	
//	for(List <Map<String, Object>> a:dataList) {
//		System.out.println(a);
//	}
	}
}
