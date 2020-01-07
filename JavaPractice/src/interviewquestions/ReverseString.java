package interviewquestions;

public class ReverseString {

	public static void main(String[] args) {
		String input = "this is a test string";
		String output = reverseString(input);
		System.out.println(output);
		
	}
	
	public static String reverseString(String stringToReverse){
			String reverse = "";
			
			if(stringToReverse.isEmpty() || stringToReverse == null){
				System.out.println("Empty and null strings are not accepted.");
			}
			else if(stringToReverse.length() == 1){
				return stringToReverse;
			}
			else {
				String[] originalArray = stringToReverse.split("\\s+");
				for(String item : originalArray){
					reverse = item + " " + reverse;
				}
			}
			return reverse.trim();
		}
}

		