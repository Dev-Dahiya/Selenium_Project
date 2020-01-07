package test;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo2 {
	
	public static int[] randomArray(int size){
		Random random = new Random();
		int[] a = new int[size];
		for(int i = 0; i < a.length; i++){
			a[i] = random.nextInt(100);
		}
		return a;
	}

	public static void main(String[] args){
		//System.out.println(randomArray(6));
		//System.out.println(Arrays.toString(randomArray(6)));
		int numValue = 8;
		int[] b = randomArray(numValue);
		printArray(b);
	}
	public static void printArray(int[] a){
		System.out.print("{" + a[0]);
		for(int i = 1; i < a.length; i++){
			System.out.print(", " + a[i]);
		}
		System.out.println("}");
		
	}
}
