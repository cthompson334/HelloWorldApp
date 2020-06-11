package com.cognixia.jump.fullstack.interfaces;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class CollectionsRunner {

	public static void main(String[] args) {
		
		// Wrapper CLasses
		int i = 1;      	Integer I = i;
		double d = 2.0; 	Double D = d;
		boolean b = true; 	Boolean B = b;
		char c = '3';		Character C = c;
		
		int j = Integer.valueOf(c);
		
		// List
		List<Animal> animalList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		animalList.add(new WolfHybrid());
		animalList.add(new Elephant());
		animalList.add(new Elephant());
		
		Integer[] ints = {2, 4, 6, 8, 10, 2, 14, 2, 18, 2};
		
		intList = Arrays.asList(ints);
		System.out.println(intList);
		
		List<Animal> animalLL = new LinkedList<>(animalList);

		// Set
		Set<Animal> animalSet = new HashSet<>(animalList);
		Set<Integer> intSet = new HashSet<>(intList);
		System.out.println(intSet);

		// Queue
		Queue<Animal> animalQ = new LinkedList<>();
		

		// Dequeue
		Deque<Animal> animalDq = new LinkedList<>();
		
		// Map
		Map<Integer, String> map = new HashMap<>();
		
		List<Integer> mapList = new ArrayList<>(map.keySet());
		
		for (Integer integer : mapList) {
			
		}
		
		

	}

}
