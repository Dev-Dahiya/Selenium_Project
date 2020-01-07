package test;

public class Multiples {

	public static void main(String[] args) {
		// printRow(3, 5);;
		printTable(6);

	}

	public static void printRow(int n, int col) {
		int i = 1;
		while (i <= col) {
			System.out.printf("%4d", n * i);
			i = i + 1;
		}
		System.out.println();
	}

	public static void printTable(int rows) {
		/*int i = 1;
		while (i <= rows) {
			//printRow(i, 5);
			printRow(i, i);
			i = i + 1;
			}*/
		for(int i = 1; i <=rows; i++){
			printRow(i, i);
		}
	}
}
