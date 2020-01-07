package test;

import java.util.Scanner;

public class Logarithm_Test {

	public static void printLogarithm(double x) {
		if (x <= 0.0) {
			System.err.println("x must be greater than 0");
			return;
		}
		double result = Math.log(x);
		System.out.println("Log of " + x + " is " + result);
	}

	public static void main(String[] args) {
		// printLogarithm(1);
		Scanner in = new Scanner(System.in);
		// scanDouble(in);
		//scanDouble(in);
		runningTotal();
	}

	/*
	 * public static void scanDouble(Scanner in) {
	 * System.out.print("Enter a number: "); double x = in.nextDouble();
	 * printLogarithm(x); }
	 */

	/*
	 * public static void scanDouble(Scanner in){
	 * System.out.print("Enter a number: "); if(!in.hasNextDouble()){ String
	 * word = in.next(); System.err.println(word + " is not a number"); return;
	 * } double x = in.nextDouble(); printLogarithm(x); }
	 */

	/*
	 * public static void scanDouble(Scanner in){ boolean okay; do {
	 * System.out.print("Enter a number: "); if(in.hasNextDouble()) { okay =
	 * true; } else { okay = false; String word = in.next();
	 * System.err.println(word + " is not a number"); } } while(!okay); double x
	 * = in.nextDouble(); System.out.println(Math.log(x)); }
	 */
	public static void scanDouble(Scanner in) {
		while (true) {
			System.out.println("Enter a number: ");
			if (in.hasNextDouble()) {
				break;
			}
			String word = in.nextLine();
			System.err.println(word + " is not a number");
		}
		double x = in.nextDouble();
		System.out.println(Math.log(x));
	}

	public static void runningTotal() {
		Scanner in = new Scanner(System.in);
		int x = -1;
		int sum = 0;
		while (x != 0) {
			System.out.println("Enter a no: ");
			x = in.nextInt();
			if (x <= 0) {
				continue;
			}
			System.out.println("Adding " + x);
			sum += x;
			System.out.println("Sum of the numbers is: " + sum);
		}
	}
}
