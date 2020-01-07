package interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		// Find duplicate in an array
		int[] arr = {1, 2, 1, 4, 2};
		
		for(int i=0; i< arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[i]);
				}
			}
		}
		
		// Remove duplicate from a list
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(11);
		list.add(10);
		System.out.println(list);
		for(int i=0; i<list.size(); i++){
			for(int j=i+1; j<list.size(); j++){
				if(list.get(i) == list.get(j)){
					list.remove(j);
				}
			}
		}
		System.out.println(list);
	}
}
