package com.cognixia.jump.fullstack.classesAndObjects;

public class CalcuRunner {

	public static void main(String[] args) {

		Calculator calc = new Calculator(9, 7);
		
		calc.sum();
		
		calc.multiply();
		
		int resultSum = calc.summation(78, 22);
		
		double result = calc.divide(20, 6);
		
		System.out.println(result);
		
		System.out.println(resultSum);
		
	}

}

