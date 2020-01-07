package interviewquestions;

public class FloydTriangle {

	public static void main(String[] args) {
		int triangleSize = 4, num = 1;
		for (int i = 1; i <= triangleSize; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
