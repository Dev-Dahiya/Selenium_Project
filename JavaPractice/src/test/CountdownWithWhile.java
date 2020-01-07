package test;

public class CountdownWithWhile {
	/*public static void countdown(int n){
		while(n > 0) {
		System.out.println(n);
		n = n - 1;
		}
		System.out.println("Blastoff!");
		}*/

	public static void main(String[] args){
		//countdown(3);
		sequence(3);
		
	}
	public static void sequence(int n) {
	    while (n != 1) {
	        System.out.println(n);
	        if (n % 2 == 0) {         // n is even
	            n = n / 2;
	        } else {       n = n * 3 + 1;
	        
	        }
	    }
	}
}
