package test;

import java.util.Scanner;

public class Nw_Test {

	public static void Test() {
		Scanner in = new Scanner(System.in);
		int x = -1;
		int sum = 0;
		while (x != 0) {
			System.out.println("Enter no: ");
			x = in.nextInt();
			if (x <= 0) {
				continue;
			}
			System.out.println("Adding " + x);
			sum += x;
		}
	}
	
	public static void main(String[] args){
		Test();
	}
}
