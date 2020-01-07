
public class ReverseCharacters {

	public static void main(String[] args) {
		String input = "This is test string";
		String output = revChar(input);
		System.out.println(output);

	}
	
	private static String revChar(String input) {
		String reverse = "";
		
		for (int i = input.length() - 1; i >= 0; i --) {
			reverse = reverse + input.charAt(i);
		}
		
		return reverse;
	}

}
