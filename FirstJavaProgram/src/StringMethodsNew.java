
public class StringMethodsNew {

	public static void main(String[] args) {
		String str = "This is test string";
		String str1 = "--adding";
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "";
		String str5 = "    Yash Dahiya     ";
		
		
		System.out.println(str.length());
		System.out.println(str.charAt(6));
		System.out.println(str.concat(str1));
		System.out.println(str.contains("Is"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.endsWith("string"));
		System.out.println(str2.equals(str3));
		System.out.println(str.indexOf("s"));
		System.out.println(str.isEmpty());
		System.out.println(str4.isEmpty());
		System.out.println(str5.trim());
		System.out.println("Replace Example: " + str2.replace('e', 'o'));
		System.out.println("Substring Example1: " + str.substring(5));
		System.out.println("Substring Example2: " + str.substring(5, 11));
		System.out.println("Lower case example: " + str.toLowerCase());
		System.out.println("Upper case example: " + str.toUpperCase());
		char[] charArray = str.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index: " + i + "is: " + charArray[i]);
		}

	}

}
