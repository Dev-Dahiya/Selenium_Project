package test;

public class Boolean_Method {
/**
 * Tests whether x is a single digit number.
 * @param x the integer to test
 * @return true if x is one digit, false otherwise.
 */
	public static boolean isSingleDigit(int x) {
		/*if(x > -10 && x <10) {
			return true;
		} else {
			return false;
		}*/
		return x > -10 && x <10;
	}
	
	public static void main(String[] args) {
		isSingleDigit(-10);
	}
}
