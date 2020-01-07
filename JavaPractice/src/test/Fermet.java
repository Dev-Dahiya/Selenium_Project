package test;

public class Fermet {
	public static void main(String[] args) {
		checkFermet(2, 4, 3, 1);
	}
	
	public static void checkFermet(int a, int b, int c, int n) {
		boolean result = Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n);
		if (n > 2 && result) {
			System.out.println("Holy smoke, Fermat was wrong!");
		} else if (n <= 2 && result) {
			System.out.println("No, that does not work");
		}
	}

}
