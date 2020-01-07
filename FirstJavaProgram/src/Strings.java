
public class Strings {

	public static void main(String[] args) {
//String Literal - String Constant Pool
		String str1 = "Hello";
		String str3 = "Hello";

//String Object - Heap
		String str2 = new String(" Welcome");
		String str4 = new String ("Welcome");
			
		str1 = "No Hello";
		
		String stradd = str1 + str2;
		System.out.println("Addition: " +stradd);
	}

}
