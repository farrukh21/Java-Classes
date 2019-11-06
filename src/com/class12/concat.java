package com.class12;

public class concat {
public static void main(String[] args) {
	/*
	 * this method appends one String to end of another
	 * the method returns a String with a the value of the
	 * String passed in to the method appended to the end
	 * of the String used to invoke this method
	 * 
	 */
   String str3="Hello";
   String str4="World";
   
   System.out.println(str3+" "+str4);
   System.out.println(str3.concat(" "+str4));


   /*
    * This method returns a copy of the string,
    * with leading and trailing whitespace omitted.
    */
   String b=" How are you? ";
   System.out.println(b.trim());
   
   /*
    * This method returns he character located at the String's specified index.
    * The string inexes start from zero.
    */

   String str7="We might be done early today";
   System.out.println(str7.charAt(3));
   
   /*
    * This method returns the index within this string of the 
    * first occurence of the specified character -1
    * if the character does not occur.
    */

   String str8="We might not be done early";
   System.out.println(str8.indexOf('m'));
   System.out.println(str8.indexOf('m',4));//-number is the point where to start
   
}
}
