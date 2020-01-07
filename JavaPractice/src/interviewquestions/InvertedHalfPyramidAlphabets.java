package interviewquestions;

public class InvertedHalfPyramidAlphabets {

	public static void main(String[] args) {
		char first = 'A', alphabet = 'E';
		for (int i = ('E' - first); i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print(alphabet + " ");
			}
			alphabet--;
			System.out.println();

		}

	}

}
