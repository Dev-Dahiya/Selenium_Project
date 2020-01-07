package test;

public class Multadd {
	
	public static double multadd(double a, double b, double c){
		return a *b + c;
	}

	public static void main(String[] args){
		System.out.println(multadd(1.0, 2.0, 3.0));
		double a1 = Math.cos(Math.PI/4);
		double a2 = 1.0/2.0;
		double a3 = Math.sin(Math.PI/4);
		System.out.println(multadd(a1, a2, a3));
		System.out.println(expSum(2));
		
	}
	public static double expSum(double x){
		double a = x;
		double b = Math.exp(-x);
		double c = Math.sqrt((1 - b));
		double result = multadd(a, b, c);
		return result;
	}
}

