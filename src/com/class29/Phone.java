package com.class29;

public abstract class Phone {
//implemented methods
	public void makeCall() {
		System.out.println("Make call");
	}
	
	public void sendText() {
		System.out.println("Send text");
	}
	//unimplemented method
	public abstract void takePictures();
	
	public abstract void playGames();
}
class Iphone extends Phone{

	@Override
	public void takePictures() {
		System.out.println("Iphone takes pictures");
		
	}

	@Override
	public void playGames() {
		System.out.println("Play games on Iphone");
		
	}
	
}
//concrete class
class Samsung extends Phone{

	@Override
	public void takePictures() {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playGames() {
		System.out.println("Play games on Iphone");
	}
}