package com.class09;

public class NestedLooPTask {

	public static void main(String[] args) {
		
		for(int a=0; a<=23; a++) {
			for(int m=0; m<60; m++) {
				if(m<10) {
					System.out.println(a+":"+"0"+m);
				}else {
					System.out.println(a+":"+m);
				}
			}
		}
	}

}
