package com.cognixia.jump.fullstack.collections;

import java.util.ArrayList;

public class Cars {

	public static void main(String[] args) {
		// Create an ArrayList object called cars

		ArrayList<String> cars = new ArrayList<String>();
		// #1 .add
		cars.add("Ford");
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Kia");
		System.out.println(cars);
		System.out.println();

		// added later
		cars.add("Volvo");
		// #3 loop
		for (String car : cars) {
			System.out.println(car);

		}
		System.out.println();
		// #2 .get
		System.out.println(cars.get(1));
		System.out.println(cars.get(3));
		System.out.println(cars.get(2));
		System.out.println(cars.get(0));
		// added later
		System.out.println(cars.get(4));
		System.out.println();
		// updated array cars
		System.out.println(cars);
		System.out.println();

		// #4 delete and update
		cars.set(0, "Mazda");
		System.out.println(cars);
		System.out.println();
		
		//bonus
		System.out.println(cars.lastIndexOf("Honda"));
		
	}
}
