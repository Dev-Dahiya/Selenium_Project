package test;

public class Power {

	/*public static double power(double x, int n){
		double result = 0.0;
		if(n == 0) {
			return 1.0;
		}
		else if(n > 0 && (n%2 != 0)){
		double recursive = power(x, n-1);
		result = x*recursive;
		return result;
		}
		else if(n > 0 && n % 2 == 0){
			double recursion = Math.pow((Math.pow(x, n/2)), 2);
			return recursion;
		}
		return result;
	}*/
	
	public static void main(String[] args){
		factorial(2.0, 4);
		
	}
	/*public static void factorial(double x, int n){
		int i;
		for(i = n; i < n; i--) {
		double value = (Math.pow(x, (i-1)));
		x = x * value;
		System.out.println(x);
		}
		
		
	}*/
	public static void factorial(double x, int n){
		int i = 1;
		double ans = 1;
		
		while(i <= n) {
			ans = ans * x;
			i = i + 1;
		}
		System.out.println(ans);
	}
	
}
