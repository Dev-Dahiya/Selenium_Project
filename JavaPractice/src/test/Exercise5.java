package test;

public class Exercise5 {
	public static void zoop(String fred, int bob) {
		System.out.println(fred);
		if (bob == 5) {
			ping("not ");
		} else {
			System.out.println("!");
		}
	}

	public static void main(String[] args) {
		int bizz = 5;
		int buzz = 2;
		zoop("just for", bizz);
		clink(2 * buzz);
		/*double raise = Math.pow(2.0, 3.0);
		System.out.println(raise);*/
	}

	public static void clink(int fork) {
		System.out.print("It's ");
		zoop("breakfast ", fork);
	}

	public static void ping(String strangStrung) {
		System.out.println("any " + strangStrung + "more ");
	}

}
