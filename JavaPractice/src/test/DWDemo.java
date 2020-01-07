package test;
import java.util.Scanner;

public class DWDemo {
	public static void main(String[] args)
	throws java.io.IOException {
		char ch;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.println("Please enter the letter: ");
//			ch = (char)System.in.read();
			ch = s.next().charAt(0);
		} while(ch!='q');
		
	}

}
