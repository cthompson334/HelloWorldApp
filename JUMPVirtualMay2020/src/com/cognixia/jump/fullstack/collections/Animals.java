package com.cognixia.jump.fullstack.collections;

import java.util.HashSet;

public class Animals {

	public static void main(String[] args) {

		// Create a HashSet object
		HashSet<String> animals = new HashSet<String>();
		// #1 .add no duplicates
		// Carole Baskin fed her husband to Tigers jk lol
		animals.add("Monkey");
		animals.add("Tiger");
		animals.add("Bear");
		animals.add("Monkey");
		animals.add("Tiger");
		animals.add("Monkey");

		System.out.println(animals);
		System.out.println();
		
		//bonus
		System.out.println(animals.contains("Tiger"));
		System.out.println();

		// #2 .get?? returns next element
		for (String animal : animals) {
			if (animal.equals("Tiger")) {
			System.out.println(animal);
			}
		}
		System.out.println(animals.isEmpty());
		System.out.println(animals.iterator().next());
		System.out.println();
		
		// #3 for loop
		for (String animal : animals) {
			System.out.println(animal);
		}

		System.out.println();

		// #4 delete and update
		animals.remove("Monkey");
		animals.add("Lion");
		System.out.println(animals);

	}
}
