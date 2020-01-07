package test;

import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {

	public static void main(String[] args) {
		machineGuess(args);
		

	}

	public static void machineGuess(String[] args) {
		int machineNumber;
		Random random = new Random();

		machineNumber = random.nextInt(5) + 1;
		System.out.println("I m thinking of a number between 1 and 5");
		System.out.println("(including both) Can u guess what it is?");

		// System.out.println("The number I was thinking of is: " +
		// machineNumber);
		userGuess(machineNumber);

	}

	public static void userGuess(int machineNumber) {
		int userNumber;
		
		Scanner in = new Scanner(System.in);

		System.out.print("Type a number: ");
		userNumber = in.nextInt();
		System.out.println("Your guess is: " + userNumber);
		if (userNumber != machineNumber) {
			if (userNumber > machineNumber) {
				System.out.println("That was too high!");
			} else if (userNumber < machineNumber) {
				System.out.println("That was too low!");
			}
			userGuess(machineNumber);
		} else {
			System.out.println("You won!!!");
		}
	}
}
