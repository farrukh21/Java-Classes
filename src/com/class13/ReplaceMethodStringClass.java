package com.class13;

public class ReplaceMethodStringClass {

	public static void main(String[] args) {
		/*. replace()
		 * This method returns a new string resulting
		 * from replacing all occurences of string
		 * in this string with newCharsequence.
		 * 
		 */
		
		String str="Hello Dear, how are you, How you been?";
		
		System.out.println(str.replace('e', 'z'));
		
		System.out.println(str.replace("Dear", "Respected"));
		
		System.out.println(str.replaceFirst("you", "is he"));
		
		String q ="12-22-1990"; //12/22/1990
		System.out.println(q.replace("-", "/"));
		
		System.out.println(str.replaceAll("\\w", ""));
		
	
	}
}
