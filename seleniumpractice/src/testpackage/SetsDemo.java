package testpackage;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	// Unique property of Set is that it stores only unique elements. If we try to add an element which is already existing in the Set; it won't be added.
	public static void main(String[] args) {
		// Hash Set - does not maintain any order
		Set<String> set = new HashSet<String>();
		
		set.add("Maruti");
		set.add("Mercedese");
		set.add("Mahindra");
		set.add("Mahindra");
		
		System.out.println(set);
		for (String item : set) {
			System.out.println("Items in Hash Set: " + item);
		}
		
		// LinkedHashSet - maintains the order in which elements are added
		Set<String> lHset = new LinkedHashSet<String>();
		
		lHset.add("Maruti");
		lHset.add("Mercedese");
		lHset.add("Mahindra");
		
		for (String item : lHset) {
			System.out.println("Item in Linked Hash Set: " + item);
		}
		
		// TreeSet - maintains natural sorting order
		Set<String> tSet = new TreeSet<String>();
		tSet.add("Maruti");
		tSet.add("Mercedese");
		tSet.add("Mahindra");
		for (String item : tSet) {
			System.out.println("Item in Tree Set: " + item);
		}
		
	}

}
