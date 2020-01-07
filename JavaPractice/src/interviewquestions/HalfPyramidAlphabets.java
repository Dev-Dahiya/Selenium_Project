package interviewquestions;

public class HalfPyramidAlphabets {

	public static void main(String[] args) {
		char last = 'E', alphabet = 'A';
		for(int i=0; i<=(last-'A'); i++){
			for(int j=0; j<=i; j++){
				System.out.print(alphabet + " ");
			}
			alphabet++;
			System.out.println();
		}
	}
}
