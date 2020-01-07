package interviewquestions;
import java.util.Scanner;

public class ReverseStringCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be reversed: ");
		String stringToReverse = scan.nextLine();
		String output = reverseStringChars(stringToReverse);
		scan.close();

		System.out.println(output);

	}
	
// First Way
	public static String reverseStringChars(String input){
		String reverse = "";
		
		Scanner scan = new Scanner(System.in);
		while(input.isEmpty() || input == null){
			System.out.println("Empty and null strings are not accepted. Please enter a valid string");
			input = scan.nextLine();
		}
		scan.close();
		
		if(input.length() == 1) {
			return input;
		}
		else {
			for(int i=input.length()-1; i>=0; i--){
				reverse = reverse + input.charAt(i);
			}
			return reverse;
		}
		
	}
	
// Second Way	
//	public static String reverseStringChars(String input){
//		String reverse = "";
//		
//		while(input.isEmpty() || input == null){
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Empty and null strings are not accepted. Please enter a valid string");
//			input = scan.nextLine();
////			scan.close();
//		}
//		
//		if(input.length() == 1){
//			return input;
//		}
//		else {
//			char[] originalArray = input.toCharArray();
//			for(char item : originalArray){
//				reverse = item + reverse; // d, e+d, v+ed
//			}
//		}
//		return reverse;
//	}

}
