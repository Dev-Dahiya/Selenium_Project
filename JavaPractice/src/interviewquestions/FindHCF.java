package interviewquestions;

public class FindHCF {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 = 65;
		int max;
		int hcf = 1;

		if (num1 > num2)
			max = num1;
		else
			max = num2;

		for (int i = 1; i <= max; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
		}

		System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

	}

}
