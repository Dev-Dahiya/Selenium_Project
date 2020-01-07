package testpackage;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		// Maps store value in pair (known as key-value pair). Each pair is called an element. Values can be duplicate but the Key should always be unique.
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(2, "Maruti");
		map.put(6, "Mercedese");
		map.put(3, "Mahindra");
		
		//System.out.println(map);
		
		String value1 = map.get(6);
		System.out.println(value1);
		
		map.put(6, "Audi");
		String value2 = map.get(6);
		System.out.println(value2);

	}

}
