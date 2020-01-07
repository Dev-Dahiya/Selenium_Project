package test;

public class Log_Table {
	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			double x = i;
			//System.out.println("log of " + i + " is: " + Math.log(x));
			System.out.println("log of " + i + " is: " + Math.log(x)/Math.log(2));
			i = i + 1;

		}
	}

}
