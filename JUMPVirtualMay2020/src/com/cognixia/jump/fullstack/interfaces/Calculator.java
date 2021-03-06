package com.cognixia.jump.fullstack.interfaces;

public interface Calculator {

	// attributes
	double PI = 3.14;
	
	static int sum(int... inputs) {
		int sum = 0;
		for (int i : inputs) {
			sum+=i;
		}
		return sum;
	}
	
	default int multiply(int...inputs) {
		int product = 1;
		
		
		for (int i : inputs) {
			if(i == 0) {
				return 0;
			}
			product*=i;
		}
		
		return product;
	}
}
