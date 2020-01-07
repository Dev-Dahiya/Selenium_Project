package test;

public class BeerSong3 {
	public static void main(String[] args) {
		lyricsBeer(99);
	}

	public static void lyricsBeer(int beerNum) {
		String word = "bottles";
		if (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";
			}
				System.out.println(beerNum + " " + word + " of beer on the wall,");
				System.out.println(beerNum + " " + word + " of beer,");
				System.out.println("ya’ take one down, ya’ pass it around,");
				beerNum = beerNum - 1;
				if (beerNum == 1) {
					word = "bottle";
				}
				else if (beerNum >= 1) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
				}
				else {
					System.out.println("No bottles of beer on the wall,");
					System.out.println("no bottles of beer,");
					System.out.println("ya’ can’t take one down, ya’ can’t pass it around,");
					System.out.println("’cause there are no more bottles of beer on the wall!");
				}
				lyricsBeer(beerNum);
			}
		}
	}

