package com.class38;

public class FinallyBlock {
	public static void main(String[] args) {
		String str="Hello";
		
		try {
			char charter=str.charAt(20);
			System.out.println(charter);
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();	
		}finally {
			System.out.println("I am a finaly block");
		}
		System.out.println("End of the code");
	}
	}


