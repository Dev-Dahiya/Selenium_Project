package test;

public class Exercise7_2 {
	public static void squareRoot(double a) {
		double x0 = 5;
		double x1 = (x0 + a / x0) / 2;
		System.out.println(x1);
		double x2 = (x1 + a / x1) / 2;
		System.out.println(x2);

		
		while (Math.abs(x1 - x2) >= 0.0001) {
			x1 = (x2 + a/x2)/2;
			System.out.println("new value of x1 is: " + x1);
			x2 = (x1 + a/x1)/2;
			System.out.println("new value of x2 is: " + x2);
			}
		
	}
	public static void main(String[] args) {
		squareRoot(9);
	}
}
