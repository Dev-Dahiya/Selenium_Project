
import java.util.*;
public class ArraysNew {

	public static void main(String[] args) {
		/*int[] intArray;
		intArray = new int[10];
		intArray[0] = 100;
		intArray[1] = 90;*/
		
		int[] intArray = {90, 80};
		
		System.out.println("Value of zero index is: " + intArray[0]);
		System.out.println("Value of first index is: " + intArray[1]);
		//System.out.println("Value of second index is: " + intArray[2]);
		
		//String[] stringArray = {"audi", "bmw", "honda"};
		
		String[] stringArray;
		stringArray = new String[3];
		stringArray[0] = "maruti";
		stringArray[1] = "tata";
		stringArray[2] = "mahindra";
		
		System.out.println("Value of zero index of string array is: " + stringArray[0]);
		System.out.println("Value of first index of string array is: " + stringArray[1]);
		System.out.println("Value of second index of string array is: " + stringArray[2]);
		
		/*System.out.println("length of int array is: " + intArray.length);
		System.out.println("length of string array is: " + stringArray.length);*/
		
		int len1 = intArray.length;
		int len2 = stringArray.length;
		System.out.println("length of int array is: " + len1);
		System.out.println("length of string array is: " + len2);
		
		Arrays.sort(intArray);
		
		for (int i = 0; i < len1; i++) {
			System.out.println(intArray[i]);
		}
		
	}
}
