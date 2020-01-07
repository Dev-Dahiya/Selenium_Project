package test;

public class Void_Method {
	
	public static int sumNum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int multiplySum(int c) {
		int result = sumNum(1, 2)*c;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(multiplySum(3));
	}
}
