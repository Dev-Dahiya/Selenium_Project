package interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		// We can sort an array in ascending order by using Arrays.sort() method as shown below
		int[] num1 = {12, 1, 5, -2, 16, 14};
		Integer[] num2 = {6, 1, 0, 7, -1};
		Arrays.sort(num2);
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
			
		/* To sort an array in descending order we can use Collections.reverseOrder()
		 * method from Collections class. The array to be sorted should not have 
		 * primitive type elements.
		 */ 
		Integer[] num3 = {13, 7, 6, 45, 21, 9, 2, 100};
		Arrays.sort(num3, Collections.reverseOrder());
		System.out.println(Arrays.toString(num3));
				
		List<Integer> list1 = new ArrayList <>();
		list1.add(10);
		list1.add(5);
		list1.add(11);
		list1.add(12);
		// To sort list in ascending order
		Collections.sort(list1);
		System.out.println(list1);
		
		// To sort list in descending order
		Collections.reverse(list1);
		System.out.println(list1);
		
// Methods which we need to know for interviews
		// Sort Array - Ascending
		int tmp;
		for(int i=0; i<num1.length; i++){
			for(int j=i+1; j<num1.length; j++){
				if(num1[i] > num1[j]){
					tmp = num1[i];
					num1[i] = num1[j];
					num1[j] = tmp;
				}
			}
		}
		System.out.println("*****************");
		System.out.println(Arrays.toString(num1));
		
		// Sort Array in descending order
		int tmp1;
		for(int i=0; i<num1.length; i++){
			for(int j=i+1; j<num1.length; j++){
				if(num1[i] < num1[j]){
					tmp1 = num1[i];
					num1[i] = num1[j];
					num1[j] = tmp1;
				}
			}
		}
		System.out.println("*****************");
		System.out.println(Arrays.toString(num1));
		
		// Sort List in Ascending Order
		Integer tmp3;
		List<Integer> list = new ArrayList <>();
		list.add(10);
		list.add(5);
		list.add(11);
		list.add(12);
		list.add(-1);
		list.add(3);
		list.add(0);
		System.out.println("List before sorting: " + list);
		for(int i = 0; i < list.size(); i++){
			for(int j = i+1; j < list.size(); j++){
				if(list.get(i) > list.get(j)){
					tmp3 = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp3);
				}
			}
		}
		System.out.println("List after ascending sort: " + list);
		
		// Sort list in Descending order
		for(int i = 0; i < list.size(); i++){
			for(int j = i+1; j < list.size(); j++){
				if(list.get(i) < list.get(j)){
					tmp3 = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp3);
				}
			}
		}
		System.out.println("List after descending sort: " + list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
