package com.class29;

public class VehicleTest {
	public static void main(String[] args) {
		Car car=new BMW();
		car.drive();
		car.stop();
		
		Vehicle vehicle= new BMW();
		vehicle.drive();
		vehicle.stop();
		vehicle.start();
		vehicle.speed();
	}

}
