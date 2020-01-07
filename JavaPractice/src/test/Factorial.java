package test;

public class Factorial {

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		int recursive = factorial(n - 1);
		int result = n * recursive;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(factorial(3));
	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);

	}
}
