package com.class28;

public class userInfo extends userClass {

	String adress;
	userInfo(String adress, String name, int mobileNum){
		super(name, mobileNum);
		this.adress=adress;
		
	}
public static void main(String[] args) {
	userInfo con=new userInfo("31mkr","Farrukh",571354);
	con.print();
	
}
void print() {
	System.out.println(adress+" "+name+" "+mobileNum);
	
}
}
