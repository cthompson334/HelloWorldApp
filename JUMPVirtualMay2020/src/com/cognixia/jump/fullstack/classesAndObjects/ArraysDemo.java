package com.cognixia.jump.fullstack.classesAndObjects;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		// declaring array
		int[] intArr1;
		int intArr2[];
		
		Cat[] cats;
		
		// initializing
			// this makes a new array of size 5, with def values = 0;
		intArr1 = new int[5];
		cats = new Cat[5];
		// intArr2 = {50, 40, 35, 45, 10}; <- not valid
		
		// declare and initialize
		int[] intArr3 = {50, 40, 35, 45, 10};
		
		Cat[] litter = {new Cat(10, "Mittens", "Tabby"), 
				new Cat(), new Cat()};
		
		// initial values
		
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.toString(cats));
		
		// reading / writing / accessing array
		System.out.println(litter[0]);
		intArr1[2] = 100;
		
		litter[2] = null;
		
		// out of bounds
		//System.out.println(litter[10]);
		
		System.out.println(Arrays.toString(intArr1));
		System.out.println(Arrays.toString(litter));
		
		// iterating / looping through array
		
			// traditional for loop
			// start at beginning go through each till end
			for(int i = 0; i < intArr3.length; i++) {
				System.out.println(intArr3[i]);
			}
			System.out.println();
			
			for(int i = litter.length-1; i >=0; i--) {
				System.out.println(litter[i]);
			}
		
			// for each loop
		
				// primitive array
				// array of objects
		
		// Homogenous and Hetrogenous Arrays (Inherritence)
		
		// Array class static methods
		
		// Utility class - Arrays

	}

}
