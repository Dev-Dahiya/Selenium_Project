package test;

import java.util.Arrays;

public class Exercise7_4 {
	
	/*public static int factorial(int n){
		if(n == 0){
			return 1;
		}
		int recursive = factorial(n - 1);
		int result = n * recursive;
		return result;
	}*/

	public static void main(String[] args){
		//factorial1(3);
		int[] counts = new int[4];
		int[] charge = {};
		double[] values = new double[3];
		//System.out.println("Last element: " + counts[3]);
		counts[0] = 7;
		counts[1] = counts[0]*2;
		counts[2]++;
		counts[3]-= 60;
		
		/*int i = 0;
		while(i < 4) {
			System.out.println(counts[i]);
			i++;
		}*/
		/*int i = 0;
		for(i = 0; i < 4; i++){
			System.out.println(counts[i]);
		}*/
		//System.out.println(values);
		int[] a = {1, 2, 3, 4};
		//printArray(a);
		//System.out.println(Arrays.toString(a));
		
	}
	
	public static void factorial1(int n){
		int i = 1;
		int result = 1;
		
		while(i <= n) {
			int value = n - 1;
			result = result * value;
			i = i + 1;
		}
		
		System.out.println(result);
	}
	
	public static void printArray(int[] a){
		System.out.print("{" + a[0]);
		for(int i = 1; i < a.length; i++){
			System.out.print(", " + a[i]);
		}
		System.out.println("}");
		
	}
}
