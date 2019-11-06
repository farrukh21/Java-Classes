package com.class11;

public class Task2dArray {

	public static void main (String args[]) {
String [][] names= {
                
                {"Khan","Yousuf","Alex","Zynab"},
                {"Mohammad","Anna","Anton","Weqas"},
                {"Diago","Asif","Zubair","Shogofa"}
                
                
                
        };
        
        int lengthOfRows=names.length;
        System.out.println(lengthOfRows);
        int lengthOfColumns=names[0].length;
        System.out.println(lengthOfColumns);
        
        for(String getArrays[]:names) {
            
            for(String getName:getArrays) {
                
                System.out.print(getName+ " ");
            }
            System.out.println();

        }



	}
}
