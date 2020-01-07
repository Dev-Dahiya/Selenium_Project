package test;

public class GalToLit {
	public static void main(String[] args){
		double gallons;
		double liters;
		
		gallons = 10;
		liters = gallons * 3.7854;
		
		System.out.println(gallons + " gallon contains: " + liters + " liters");
		
		if(10 < 11) {
			System.out.println("10 is less than 11");
			
		}
		
		if(10 < 12) System.out.println("This won't be displayed");
	}

}
