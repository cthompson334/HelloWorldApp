package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class ReadWithExceptions {

	public static void main(String[] args) {
		// We need to make a Scanner tool to get input
		// Scanner input = new Scanner(System.in);
		// int userInput = 0;
		// Prompt the User for input
		// System.out.println("Please enter a number: ");
		//
		// Read the user input
		// try {
		// userInput = input.nextInt();
		// } catch (Exception e) {
		// System.out.println("Please enter only integers");
		// } finally {
		// close the input
		// input.close();
		// }
		//
		// print the input to show that we stored / received it
		// System.out.println(userInput);
		// We need to make a Scanner tool to get input

		int userInput = 0;
		// Prompt the User for input
		System.out.println("Please enter a number: ");

		// Read the user input try with resources
		try (Scanner input = new Scanner(System.in)) {
			userInput = input.nextInt();
		} catch (Exception e) {
			System.out.println("Please enter only integers");
		} finally {
			System.out.println("We are done.");
		}

		// print the input to show that we stored / received it
		System.out.println(userInput);

	}

}