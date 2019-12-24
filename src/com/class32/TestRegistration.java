package com.class32;

public class TestRegistration {
	
		public static void main(String[] args) {
			Registration reg=new Registration();
			reg.setUserName("Sysntax2019");
			String user=reg.getUserName();
			System.out.println(user);
			reg.setPassword("64574KJFDFTRRT");
			String pass=reg.getPassword();
			System.out.println(pass);
			reg.setEmail("syntax@mail.com");
			String email=reg.getEmail();
			System.out.println(email);
}

}
