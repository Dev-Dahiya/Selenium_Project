package testpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapsIteration {

	public static void main(String[] args) {
		// HashMap - does not maintain any order. Also it allows one null key
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(2, "Maruti");
		hMap.put(6, "Mercedese");
		hMap.put(3, "Mahindra");
		
		System.out.println("Iteration 1");
		for(Map.Entry<Integer, String> entry : hMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key  + ", Value: " + value);
			}
		
		System.out.println("Iteration 2");
		for(Integer key : hMap.keySet()) {
			String value = hMap.get(key);
			System.out.println("Key: " + key + ", Value " + value);
		}

		//LinkedHashMap - maintains the order in which elements are added
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		linkedMap.put(2, "Maruti");
		linkedMap.put(6, "Mercedese");
		linkedMap.put(3, "Mahindra");
		
		System.out.println("Iteration 3");
		for(Map.Entry<Integer, String> entry : linkedMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value " + value);
		}
		//TreeMap - maintains natural sorting order
		Map<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(2, "Maruti");
		tMap.put(6, "Mercedese");
		tMap.put(3, "Mahindra");
		
		System.out.println("Iteration 4");
		for(Map.Entry<Integer, String> entry : tMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value " + value);
		}
		
		System.currentTimeMillis();
	}

}
