package interviewquestions;

public class Factorial {

	public static void main(String[] args) {
		int num = 10;
		long fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.printf("Factorial of %d = %d", num, fact);

	}

}
