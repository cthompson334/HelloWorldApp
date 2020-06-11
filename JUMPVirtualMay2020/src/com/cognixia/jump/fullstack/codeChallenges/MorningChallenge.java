package com.cognixia.jump.fullstack.codeChallenges;

import java.util.Scanner;

public class MorningChallenge {

	public static void main(String[] args) {
		// Make a program that adds the sum of a set of numbers that are every multiple
		// by user input, from 1-100

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number:");

		int userInput = input.nextInt();

		int sum = 0;

		if (userInput > 50) {

			System.out.println("Input a number less than 50");
		}

		else {

			for (int i = 1; i <= 100; i++) {

				if (i % userInput == 0) {
					sum += i;
				}
			}

			System.out.println("The sum of multiples of 'your userinput' is: " + sum);

			input.close();

		}
	}
}
