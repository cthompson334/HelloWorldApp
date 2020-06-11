package com.cognixia.jump.fullstack.practice;

public class FarmAnimals {
	// Attributes
	String type;
	String sound;
	
	// Static Attributes
	static int count;
		
	public void sing() {
		System.out.println("Old MacDonald had a farm Ee-I-Ee-I-O"
				+ "\nAnd on his farm he had some " + type + "\nEe-I-Ee-I-O");
	}
	
	//Constructors
	public FarmAnimals (String type, String sound) {
		this.type = type;
		this.sound = sound;
		count++;
		
	}

	
	
	
	//Methods
	
	public void makeNoise() {
		
		System.out.println("With a " + sound + " " + sound + " here and a " + sound + " " + sound
				+ " there. Here a " + sound + ", there a " + sound + "\nEverywhere a " + sound + " " + sound + ". Old MacDonald had a farm E-I-E-I-O");
		
	}
	
}
