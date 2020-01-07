package test;

public class BoolDemo {
	public static void main(String[] args){
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		
		b = true;
		System.out.println("b is " + b);
		
		if(b) System.out.println("This is executed");
		
		b = false;
		if(true) System.out.println("This is not executed");
		
		System.out.println("10 > 11 is " + (10 > 9));
		
	}

}
