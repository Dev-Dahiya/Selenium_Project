package test;

public class Triangle_Test {
	public static boolean isTrianlge(int a, int b, int c) {
		
		if((a > (b + c)) || (b > (a + c)) || (c > (a + b))) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		System.out.println(isTrianlge(20, 10, 9));
	}
}
