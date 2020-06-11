package com.cognixia.jump.fullstack.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Customers {

	public static void main(String[] args) {

		Queue<String> customers = new LinkedList<String>();
		// #1 .add
		customers.add("John");
		customers.add("Jane");
		customers.add("Bill");
		customers.add("Tim");

		System.out.println(customers);
		System.out.println();

		// Bonus
		((LinkedList<String>) customers).addFirst("Laura");
		System.out.println(customers);
		System.out.println();

		// #2 .get ??
		System.out.println(((LinkedList<String>) customers).element());
		System.out.println();
		
		// #3 loop
		for (String customer : customers) {
			System.out.println(customer);
		}
		
		System.out.println();
		
		// #4 delete and update
		((LinkedList<String>) customers).set(0, "Cindy");
		System.out.println(customers);

	}

}
