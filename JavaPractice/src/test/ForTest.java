package test;
import java.util.Scanner;

public class ForTest {
	public static void main(String[] args)
	throws java.io.IOException {
		int i;
		
//		System.out.println("Press S to stop.");
//		
//		for(i=0; (char)System.in.read() != 'S'; i++){
//			System.out.println("Pass #" +i);
//		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Press S to stop.");
		
		for(i=0; s.next().charAt(0) != 'S'; i++){
			System.out.println("Pass #" +i);
		}
	}

}
