package com.cognixia.jump.fullstack.classesAndObjects;

public class Calculator {

	// Attributes
	int one;
	int two;
	
	// Constructor
	Calculator(int one, int two) {
		
		this.one = one;
		this.two = two;
		
	}
	// Methods
	public void sum() {
		System.out.println(one + two);
	}
	
	// Make a sum method for 2 numbers that takes them as parameters
	// and then returns the sum itself
	
	public int summation(int number1, int number2) {
		
		int sum = number1 + number2;
		
		return sum;
		
	}
	
	public void multiply() {
		System.out.println(one * two);
	}
	
	// the () are the parameters - which is the data in
	public double divide(double dividend, double divisor) {
	
		double quotient = dividend / divisor;
		// the return is the data out	
		return quotient;
	    // or return dividend / divisor;
	}
	
}
