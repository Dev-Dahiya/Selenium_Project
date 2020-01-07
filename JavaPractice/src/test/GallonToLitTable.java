package test;

public class GallonToLitTable {
	public static void main(String[] args){
		double gallons, liters;
		int counter;
		counter = 0;

		for(gallons = 1; gallons <= 100; gallons++){
			liters = gallons * 3.7854;
			System.out.println(gallons + " gallons contain: " + liters + " liters");
			counter++;
			
			if(counter == 10){
				System.out.println();
				counter = 0;
				
			if(5 > 4) System.out.println("Greater");
			for(int i = 0; i <5; i++) System.out.println("for loop");
			}
		}
	}

}
