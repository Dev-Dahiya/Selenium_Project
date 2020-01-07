package test;

public class BeerSong2 {

	public static void main(String[] args) {

		int numBottle = 99;
		String name = "bottles";

		while (numBottle > 0) {
			if (numBottle == 1) {
				name = "bottle";
			}
			System.out.print(+numBottle + " " + name + " " + "of beer on the wall, ");
			System.out.println(+numBottle + " " + name + " " + "of beer.");
			System.out.println("Take one down and pass it around");

			numBottle = numBottle - 1;
			if (numBottle > 0) {
				if (numBottle == 1) {
					name = "bottle";
				}

				System.out.println(+numBottle + " " + name + " " + "of beer on the wall.");
			} else {
				System.out.println("No more bottles of beer on the wall.");
			}
		}
	}
}
