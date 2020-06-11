package com.cognixia.jump.fullstack.practice;

import java.util.Scanner;

public class OldMacDonald {

	public static void main(String[] args) {
		Scanner input;
		boolean valid;
		// Create some objects(animals)
		FarmAnimals cows = new FarmAnimals("cows", "moo");
		FarmAnimals chicks = new FarmAnimals("chicks", "cluck");
		FarmAnimals pigs = new FarmAnimals("pigs", "oink");

		
		do {
			System.out.println("Let's sing Old MacDonald had a farm!\nWhat's the first animal?");
			
			input = new Scanner(System.in);
			
			valid = input.hasNext();
			
			//System.out.println(valid);
			
			if (valid) {
				
				String userInput = input.next().toLowerCase().trim();
				
				switch (userInput) {
				case "cows":
					cows.sing();
					cows.makeNoise();
					break;
					
				case "chickens":
					chicks.sing();
					chicks.makeNoise();
					break;
					
				case "pigs":
					pigs.sing();
					pigs.makeNoise();
					break;

				default:
					System.out.println("Not a valid choice. Try Again!");

				}
			}
		} while (!valid);
		
		input.close();
	}

}
