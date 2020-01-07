	package test;

import java.util.Arrays;
import java.util.Random;

public class Exercise8_1_2 {
	public static int[] randomArray(int size) {
		int[] a = new int[size];
		Random random = new Random();
		for(int i = 0; i < size; i++){
			a[i] = random.nextInt(100);
		}
		return a;
	}
	public static void main(String[] args){
		System.out.println(Arrays.toString(randomArray(8)));
	}
public static int[] histogram(int[] a){
	int[] counts = new int[100];
	for(int i = 0; i < counts.length; i++){
		counts[i] = ;
	}
}
}
