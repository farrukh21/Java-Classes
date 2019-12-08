package com.class28;

public class Room extends Building{

	int roomNumber;
	
	Room(int roomNumber, int floor, String adress){
		super(adress, floor);
		this.roomNumber=roomNumber;
	}
	public void print() {
		System.out.println(adress+" "+floor+" "+roomNumber);
	}
	public static void main(String[] args) {
		Room room= new Room(101,10,"121 Test Drive");
		room.print();
	}
}
