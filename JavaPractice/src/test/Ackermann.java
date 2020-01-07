package test;

public class Ackermann {
	
	public static int arc(int m, int n){
		int result = 0;
		if(m == 0) {
			result = n + 1;
			return result;
		}
		else if(m > 0 && n ==0) {
			result = arc(m - 1, 1);
			return result;
		}
		else if (m > 0 && n > 0){
			result = arc(m - 1, arc(m, n - 1));
			return result;
		}
		return result;
	}
	
public static void main(String[] args){
	System.out.println(arc(2, 2));
}
}
