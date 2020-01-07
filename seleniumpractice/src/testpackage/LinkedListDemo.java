package testpackage;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();
		//List<String> cars = new LinkedList<String>();
		
		cars.add("Maruti");
		cars.add("Hyundai");
		cars.add("Mahindra");
		
		int size = cars.size();
		System.out.println("Size of the list is: " + size);
		
		System.out.println("The item at index 2 is: " + cars.get(2));
		
		for (int i = 0; i < size; i++) {
			System.out.println("The item at index " + i + " is " + cars.get(i));
		}
		
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
		
		cars.remove(2);
		System.out.println("\n");
		for (String car : cars) {
			System.out.println("The item is: " + car);
		}
		
	}

}
