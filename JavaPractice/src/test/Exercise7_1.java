package test;

public class Exercise7_1 {
	public static void main(String[] args) {
	    loop(3);
	}
	public static void loop(int n) {
	    int i = n;
	    while (i > 1) {
	        System.out.println("Value of i is: " + i);
	        System.out.println("Valueof n is: " +n);
	        if (i % 2 == 0) {
	        	i = i / 2;
	        } else {
	        	i = i + 1; }
	    }
}
}