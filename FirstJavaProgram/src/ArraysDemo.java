import java.util.*;

import java.util.*;

public class ArraysDemo {

	public static void main(String[] args) {

	//int[] myIntArray;
	//myIntArray = new int[10];
	//myIntArray[0] = 100;
	//myIntArray[1] = 99;
	//myIntArray[2] = 98;
	
	int[] myIntArray = {95, 90, 89};
		
	//System.out.println("Zeroth index value is: " + myIntArray[0]);
	//System.out.println("First index value is: " + myIntArray[1]);
	//System.out.println("Second index value is: " + myIntArray[2]);
	
	//String[] myStringArray = {"Audi", "BMW", "Maruti"};
	//System.out.println("Zeroth index value is: " + myStringArray[0]);
	//System.out.println("First index value is: " + myStringArray[1]);
	//System.out.println("Second index value is: " + myStringArray[2]);
		
		int len1 = myIntArray.length;
		//System.out.println("Length of int array is: " + len1);
		
		//int len2 = myStringArray.length;
		//System.out.println("Length of string array is: " + len2);
	
		Arrays.sort(myIntArray);
		for (int i = 0; i < len1; i++){
	System.out.println(myIntArray[i]);
	}
	
	//System.arraycopy(src, srcPos, dest, destPos, length);
}
	
	
}

