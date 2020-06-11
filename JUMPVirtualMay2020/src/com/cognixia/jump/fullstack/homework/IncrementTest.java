package com.cognixia.jump.fullstack.homework;

import java.util.Scanner;

public class IncrementTest {

	public static void main(String[] args) {

		// attributes
		Scanner input;

		boolean valid;
		
		int sum = 0;
		
		int start = 0;
		
		int end = 0;

		do {

			// Prompt the User for input
			System.out.println("Please enter a whole number to be incremented and to sum: ");

			// re-initialize the scanner
			input = new Scanner(System.in);

			// verify the right kind of input
			valid = input.hasNextInt();

			// we only Read the user input if it is valid
			if (valid) {
				// this is the actual reading
				int userInput = input.nextInt();

				sum = userInput;
				
				System.out.println("Please enter a start range for incrementation: ");

				do {

					// re-initialize the scanner
					input = new Scanner(System.in);

					// verify the right kind of input
					valid = input.hasNextInt();

					// we only Read the user input if it is valid
					if (valid) {
						// this is the actual reading
						int userInput2 = input.nextInt();

						start = userInput2;
						// valid = input.hasNextInt();
						System.out.println("Please enter an end range for incrementation: ");
						do {

							// re-initialize the scanner
							input = new Scanner(System.in);

							// verify the right kind of input
							valid = input.hasNextInt();

							// we only Read the user input if it is valid
							if (valid) {
								// this is the actual reading
								int userInput3 = input.nextInt();

								end = userInput3;
								// valid = input.hasNextInt();

							}
							
						} while (!valid);
						
					}
					
				} while (!valid);
			}

		} while (!valid);

		for (int i = start; start <= end; i += sum)
			
			if (i % sum == 0) {
				
				sum += i;
				
			}
		System.out.println("The sum of multiples of 'your user input' is: " + sum);
	
		// Bonus -
		// 1.make your program able to loop until the user chooses
		// to exit
		
		input.close();
	}

}
