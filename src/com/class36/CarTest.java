package com.class36;
import java.util.*;
import java.util.Map.Entry;

//create a car class that will have variables, methods and consructors
// create a map that will hold car number and car objects store in it

class car {
	String make, model;

	public car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void display() {
		System.out.println(make + " " + model);
	}
}

public class CarTest {

	public static void main(String[] args) {
		Map<Integer, car> mapCar = new LinkedHashMap<>();
		mapCar.put(1, new car("BMW", "X5"));
		mapCar.put(2, new car("Tesla", "S"));
		mapCar.put(3, new car("Meredes", "G"));
		mapCar.put(4, new car("TOYOTA", "Rav4"));
		mapCar.put(5, new car("Honda", "Accord"));
		mapCar.put(2, new car("Lincoln", "Mkc"));

		System.out.println(mapCar.size());

		// display only value objects
		Collection<car> coll = mapCar.values();
		for (car c : coll) {
			System.out.println(c.make + "---" + c.model);
			c.display();

		}
		System.out.println("**********************************");

		// map key to its corresponding values (entrySet or keySet)

		Set<Entry<Integer, car>> set = mapCar.entrySet();
		for (Entry<Integer, car> ent : set) {
			Integer i = ent.getKey();
			car c = ent.getValue();
			System.out.println("Key " + i + " is assicoiated with value of " + c.make);

		}
		System.out.println("____________________________________________________");

		// using keyset to map keys to values
		Set<Integer> keySet = mapCar.keySet();
		for (int key : keySet) {

			// Integer+map Object
			// System.out.println(key+mapCar.get(key).make+"_"+mapCar.get(key).model);
			car car1 = mapCar.get(key);
			String carDetails = car1.make + " " + car1.model;
			System.out.println(key + "=" + carDetails);
		}

		// use Iterator to iterate through values, keySet, entrySet

		Iterator<Entry<Integer, car>> it = mapCar.entrySet().iterator();
		while (it.hasNext()) {
			//Entry<Integer,String>it1=it.next();
		}
	}
}
