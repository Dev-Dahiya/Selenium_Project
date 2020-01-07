package test;

public class InchToMeterTable {
	public static void main(String[] args){
		double inches, meters;
		int counter = 0;
		
		for(inches = 1; inches <= 144; inches++){
			meters = inches / 39.37;
			System.out.println(inches + " inches contain " + meters + " meters");
			counter++;
			
			if(counter == 12){
				System.out.println();
				counter = 0;
			}
			
		}
		short no;
		no = 32767;
		System.out.println(no);
	}

}
