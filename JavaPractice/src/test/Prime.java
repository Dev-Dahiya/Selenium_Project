package test;

public class Prime {
	public static void main(String[] args){
//		int i, j;
//		boolean isprime;
//		
//		for(i = 2; i < 100; i++){
//			isprime = true;
//			
//			for(j = 2; j <= i/j; j++){
//				if((i%j) == 0) isprime = false;
//				
//			if(isprime) System.out.println(i + " is prime.");
//			}
//		}
		int i, j;
		
		for(i=2; i<=100; i++){
			int counter = 0;
			for(j=i; j>=1; j--){
				if((i%j) == 0) counter++;
			}
			if(counter == 2) System.out.println(i);
		}
	
	}
	

}
