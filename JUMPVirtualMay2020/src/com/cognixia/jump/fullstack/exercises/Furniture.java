package com.cognixia.jump.fullstack.exercises;

public class Furniture {

	//attributes
	String color;
	Int legs;
	
	//constructors
	public Furniture() {
		super();
	}
	public Furniture(String color) {
		
		this.color = color;
		
	}
	
	public void recline() {
		
		System.out.println("The couch reclines.");
		
	}

}
