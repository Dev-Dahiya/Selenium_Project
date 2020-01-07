
public class ReverseString {

	public static void main(String[] args) {
		String input = "This is test string";
		String output = reverse(input);
		System.out.println(output);

	}
	
	private static String reverse(String input) {
		String rev = "";
		
		if (input.isEmpty() || input == null) {
			System.out.println("empty strings are not accepted");
		}
		
		if (input.length() == 1) {
			rev = input;
		} else {
			String[] originalArray = input.split("\\s+");
				for (String item : originalArray) {
					rev = item + " " + rev;
				}
		}
		
		
		return rev.trim();
		
		
	}

}
