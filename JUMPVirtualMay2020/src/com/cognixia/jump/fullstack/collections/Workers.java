package com.cognixia.jump.fullstack.collections;

import java.util.Deque;
import java.util.LinkedList;

public class Workers {

	public static void main(String[] args) {

		Deque<String> workers = new LinkedList<String>();
		// #1 .add
		workers.add("Bruce");
		workers.add("Chris");
		workers.add("Louie");
		workers.add("James");

		System.out.println(workers);
		System.out.println();

		// #2 .get
		System.out.println(((LinkedList<String>) workers).element());
		System.out.println();

		// #3 loop
		for (String worker : workers) {
			System.out.println(worker);
		}
		System.out.println();

		// #4 delete and update
		((LinkedList<String>) workers).set(3, "Sarah");
		System.out.println(workers);
		System.out.println();

		// bonus
		workers.removeLastOccurrence("Louie");
		System.out.println(workers);

	}

}
