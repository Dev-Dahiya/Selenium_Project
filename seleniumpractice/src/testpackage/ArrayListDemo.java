package testpackage;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Audi");
		cars.add("Honda");
		cars.add("BMW");
		
		int size = cars.size();
		System.out.println("Size of the Array is: " + size);
		
		System.out.println("The item at the index 1 is: " + cars.get(1));
		
		for (int i = 0; i < size; i++) {
			System.out.println("The item at index " + i + " is " + cars.get(i));
		}
		for (String car : cars) {
			System.out.println("The item is: " + car);
			}
		
		cars.remove(2);
		for (String car : cars) {
			System.out.println("The item is: " + car);
			}
		
		}
	
		
	}


