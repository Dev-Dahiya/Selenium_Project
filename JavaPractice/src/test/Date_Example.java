package test;

public class Date_Example {
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.print("American Format: ");
		System.out.println(day + "," + " " + month + " " + date + ", " + year);
	}

	public static void printEuropean(String day, int date, String month, int year) {
		System.out.print("European Format: ");
		System.out.println(day + " " + month + " " + date + " " + year);
	}

	public static void main(String[] args) {
		// System.out.println("Hello, World!");
		String day = "Friday";
		int date = 17;
		String month = "November";
		int year = 2017;

		printAmerican(day, date, month, year);
		printEuropean(day, date, month, year);

	}
}