package interviewquestions;

public class FindLCM {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 65;
		int divisor = 1;
		for (int i = 2; i <= 10; i++) {
			while (num1 % i == 0 && num2 % i == 0) {
				divisor = divisor * i;
				num1 = num1 / i;
				num2 = num2 / i;
				i--;
				break;
			}
		}
		System.out.println("LCM: " + divisor * num1 * num2);

	}
}