package test;

import java.util.Arrays;

public class Exercise8_1_1 {

	public static double[] powArray(double[] a, int pow){
		double[] b = new double[a.length];
		for(int i = 0; i < a.length; i++){
			b[i] = Math.pow(a[i], pow);
		}
		return b;
		
	}
	
	public static void main(String[] args){
		double[] a = {2, 4, 6};
		System.out.println(Arrays.toString(powArray(a, 3)));
		
	}
}
