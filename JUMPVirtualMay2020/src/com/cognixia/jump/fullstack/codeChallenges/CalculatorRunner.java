package com.cognixia.jump.fullstack.codeChallenges;

import java.util.Scanner;

public class CalculatorRunner {

	private static int userInput2;
	private static int userInput3;
	private static int userInput;

	public static void main(String[] args) {

		Scanner input;
		Scanner input2;
		Scanner input3;

		boolean valid;

		do {
			// Prompt the User for input
			System.out.println("Please enter a number to sum the multiples of: ");
			// re-initialize the scanner
			input = new Scanner(System.in);

			// verify the right kind of input
			valid = input.hasNextInt();

			// we only Read the user input if it is valid
			if (valid) {

				int userInput = input.nextInt();
				System.out.println(userInput);
				System.out.println("Please enter a number for the start range: ");

			}
		} while (!valid);

		do {

			input2 = new Scanner(System.in);

			// verify the right kind of input
			valid = input2.hasNextInt();

			if (valid) {

				int userInput2 = input2.nextInt();
				System.out.println(userInput2);
				System.out.println("Please enter a number for the end range: ");

			}
		} while (!valid);

		do {

			input3 = new Scanner(System.in);

			// verify the right kind of input
			valid = input3.hasNextInt();

			if (valid) {

				int userInput3 = input3.nextInt();
				System.out.println(userInput3);
			}
		} while (!valid);

		
// How do I do this?
		for (int i = userInput2; userInput2 <= userInput3; i++) {

			System.out.println(userInput);
			System.out.println(userInput);
		System.out.println(userInput2);
		System.out.println(userInput3);
			if (i % userInput == 0) {
				i += userInput2;
			}
		}
		// System.out.println(userInput);

		input.close();
		input2.close();
		input3.close();
	}

}
//System.out.println("The sum of the multiples of " + userInput + " is: ");
