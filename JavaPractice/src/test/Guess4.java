package test;
import java.util.Scanner;

public class Guess4 {
	public static void main(String[] args)
	throws java.io.IOException {
		char ch, ignore, answer = 'K';
		
//		Scanner s = new Scanner(System.in);
//		
//		do {
//			System.out.println("I'm thinking of a letter between A and Z.");
//			System.out.print("Can you guess it: ");
//			ch = s.next().charAt(0);
//			
//			if(ch == answer) System.out.println("You guessed it.");
//			else {
//				if(ch < answer) System.out.println("You guessed too low.");
//				else if(ch > answer) System.out.println("You guessed too high");
//				else System.out.println("Please enter a valid choice.");
//				System.out.println("Try again!\n");
//			}
//		} while(ch != answer);
		
		do {
			System.out.println("I'm thinking of a letter between A and Z.");
			System.out.print("Can you guess it: ");
			ch = (char) System.in.read();
			
			do {
				ignore = (char) System.in.read();
			} while(ignore != '\n');
			
			if(ch == answer) System.out.println("You guessed it.");
			else {
				if(ch < answer) System.out.println("You guessed too low.");
				else if(ch > answer) System.out.println("You guessed too high");
				else System.out.println("Please enter a valid choice.");
				System.out.println("Try again!\n");
			}
		} while(ch != answer);

	}

}
