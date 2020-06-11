package com.cognixia.jump.fullstack.interfaces;

public class WolfHybrid extends Canine implements Mammal, LandBased, Calculator {
// implementing a method from Mammal
	@Override
	public void warmBlooded() {
		// TODO Auto-generated method stub
		
	}
// implementing a method from Animal
	@Override
	public void move() {

		System.out.println("moving");
		
	}
// implementing a method from LandBased
	@Override
	public void stationary() {
		
	}
	@Override
	public int stationary(int input) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int multiply(int... inputs) {
		return 0;
	}
	
}
