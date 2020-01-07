package test;

import java.util.Arrays;
import java.util.Scanner;

public class Help {
	public static void main(String[] args)
	throws java.io.IOException{
		char i;
		char ignore;
		
//		to check again

//		while((i != '1'| i != '2')){
//		System.out.println("Help on:\n\t1. if\n\t2. switch\nChoose one:");
//		i = (char)System.in.read();
//		}
//		if(i=='1'){
//			System.out.println("if explained");
//		}
//		else if(i=='2'){
//			System.out.println("switch explained");
//		}
//		else System.out.println("Please enter a valid choice");
		
		Scanner s = new Scanner(System.in);
		
		while(true){
		System.out.println("Help on:\n\t1. if\n\t2. switch\nChoose one:");
//		i = s.next().charAt(0);
		i = (char) System.in.read();
//		do {
//			ignore = (char) System.in.read();
//		} while(ignore != '\n');
		
		if(i=='1'){
			System.out.println("if explained");
		}
		else if(i=='2'){
			System.out.println("switch explained");
		}
		else System.out.println("Please enter a valid choice");
		
		if(i == '1' | i == '2') break;
		
		}
		
	}
	

}
