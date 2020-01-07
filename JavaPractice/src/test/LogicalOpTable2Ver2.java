package test;

public class LogicalOpTable2Ver2 {
	public static void main(String[] args){
		byte P, Q;
		
		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
		
		P = Q = 0b1;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t"
				+ (P | Q) + "\t" + (P ^ Q) + "\t" + (~P));
		
		P = 0b1;
		Q = 0b0;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t"
				+ (P | Q) + "\t" + (P ^ Q) + "\t" + (~P));
		
		P = 0b0;
		Q = 0b1;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t"
				+ (P | Q) + "\t" + (P ^ Q) + "\t" + (~P));
		
		P = Q = 0b0;
		System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t"
				+ (P | Q) + "\t" + (P ^ Q) + "\t" + (~P));
		
//		System.out.println(~(0));

		}

}
