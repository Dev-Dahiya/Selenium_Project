package test;

public class SumOddNumbers {

	public static int oddSum(int n) {
		if(n == 1) {
			System.out.println(n);
			return n;
		} else {
			System.out.println(n);
			int recurse = oddSum(n - 2);
			int result = n + recurse;
			return result;
		}
		
	}
	
	public static void main(String[] args){
		System.out.println(oddSum(7));
	}
}
