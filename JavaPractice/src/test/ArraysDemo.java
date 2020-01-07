package test;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args){
		//double[] a = {1.0, 2.0, 3.0};
		//double[] b = a;
		/*double[] b = new double[3];
		for(int i = 0; i < 3; i++){
			b[i] = a[i];
			System.out.println(b[i]);
		}*/
		/*double[] b = Arrays.copyOf(a, 2);
		System.out.println(Arrays.toString(b));*/
		int[] c = {1, 2, 3};
		double[] d = {2, 4, 6}; 
		//power(d);
		//System.out.println(search(c, 2));
		//System.out.println(sum(d));
		System.out.println(multiply(d));
	}

	public static int search(int[] c, int result) {
		for(int i = 0; i < c.length; i++){
			if(c[i] == result){
				return i;
			}
		}
		return -1;
	}
	public static void power(double[] d){
		for(int i = 0; i < d.length; i++){
			d[i] = Math.pow(d[i], 2);
			System.out.println(d[i]);
		}
	}
	
	public static double sum(double[] c){
		double Total = 0.0;
		for(int i = 0; i < c.length; i++){
			Total += c[i];
		}
		return Total;
	}
	public static double multiply(double[] c){
		double Total = 1.0;
		for(int i = 0; i < c.length; i++){
			Total *= c[i];
		}
		return Total;
	}
}
