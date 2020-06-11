package com.cognixia.jump.fullstack;

import java.util.Scanner;

public class BankAtm {

	public static void main(String[] args) {
		// Write a program that checks a user input
		// that input will be used to navigate through a menu.
		// The menu will be for an ATM
		// But the minimum should be having the user choose an option
		// for withdrawals, deposits, and checking current balance.
		// You can just have print statements to simulate these
		// processes.
		Scanner input;
		
		boolean valid;

		do {
			System.out.print("Welcome! Please enter your pin:");
			
			input = new Scanner(System.in);
			
			valid = input.hasNextInt();
			
			//System.out.println(valid);
			
			if (valid) {
				
				int userInput = input.nextInt();
			}
		} while (!valid);
		System.out.println("Thank You! What would you like to access?");
		
		System.out.println("A - Checking Account");
		
		System.out.println("B - Make a Withdrawal");
		
		System.out.println("C - Make a Deposit");
		
		System.out.println("D - Check current account balance");
		
		String userInput2 = input.next();
		
		switch (userInput2) {
		case "a":
		case "A":
			System.out.println("Checking");
			break;
		case "b":
		case "B":
			System.out.println("Withdrawal");
			break;
		case "c":
		case "C":
			System.out.println("Deposit");
			break;
		case "d":
		case "D":
			System.out.println("Check Balance");
			break;

		default:
			System.out.println("Not a valid choice. Try Again!");

		}
		input.close();
	}
}
