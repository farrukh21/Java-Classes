package com.class29;

public class PhoneTest {
	public static void main(String[] args) {
		//you can not directly create an object of an abstract class
		//Phone phone= new Phone(); cannot instanciate
		
		// we can create it indirectly
		
		Phone phone= new Iphone();
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.makeCall();
		phone.playGames();
	}

}
