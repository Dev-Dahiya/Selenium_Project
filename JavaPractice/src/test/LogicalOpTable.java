package test;

public class LogicalOpTable {
	public static void main(String[] args){
		boolean P, Q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		P = Q = true;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t"
				+ (P | Q) + "\t" + (P ^ Q) + "\t" + (!P));
		
		P = true;
		Q = false;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t"
				+ (P | Q) + "\t" + (P ^ Q) + "\t" + (!P));
		
		P = false;
		Q = true;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t"
				+ (P | Q) + "\t" + (P ^ Q) + "\t" + (!P));
		
		P = Q = false;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t"
				+ (P | Q) + "\t" + (P ^ Q) + "\t" + (!P));
		
	}

}
