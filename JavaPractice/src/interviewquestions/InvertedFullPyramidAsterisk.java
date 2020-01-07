package interviewquestions;

public class InvertedFullPyramidAsterisk {

	public static void main(String[] args) {
		int pyramidSize = 5;
		for (int i = pyramidSize; i >= 1; i--) {
			for (int j = i; j <= pyramidSize - 1; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
