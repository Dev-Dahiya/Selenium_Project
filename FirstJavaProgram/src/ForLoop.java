
public class ForLoop {

	public static void main(String[] args) {
		
		/*for (int i = 0; i < 10; i++) {
			System.out.println("value of i is: " +i);
		}
*/
		int [] numbers = {10, 20, 30};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("value of i at index " + i + " is: " + numbers[i]);
		}
		
		String [] cars = {"audi", "bmw", "honda"};
		for (String car: cars) {
			System.out.println(car);
			
		}
		
	}

}
