package test;

public class ScopeDemo {
	public static void main(String[] args){
		int x = 10;
		if(x == 10){
			int y = 20;
			System.out.println("X and Y: " + x + " " + y);
			
			x = y * 2;
			if(y == 20){
				System.out.println("Y is: " + y);
			}
		}
		System.out.println("X is " + x);
	}

}
