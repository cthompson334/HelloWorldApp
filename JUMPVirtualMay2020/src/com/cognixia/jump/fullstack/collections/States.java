package com.cognixia.jump.fullstack.collections;

import java.util.HashMap;

public class States {

	public static void main(String[] args) {

		HashMap<String, String> cities = new HashMap<String, String>();
		// #1 .add
		cities.put("Montgomery ", " Alabama");
		cities.put("Baton Rouge ", " Louisiana");
		cities.put("Jackson ", " Mississippi");
		cities.put("Atlanta ", " Georgia");

		System.out.println(cities);
		System.out.println();

		// #2 .get
		System.out.println(cities.get("Jackson "));
		System.out.println();

		// #3 loop
		for (String i : cities.keySet()) {
			System.out.println(i);
		}

		System.out.println();

		// #4 delete and update
		cities.remove("Montgomery ");
		cities.put("Mobile ", " Alabama");
		System.out.println(cities);
		System.out.println();

		// bonus
		System.out.println(cities.entrySet());

	}

}
