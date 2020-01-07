package test;

public class SqrRoot {
	public static void main(String[] args){
//		int  num;
		double num, sroot, roerr;
		
		for(num=1; num<100;num++){
			sroot = Math.sqrt(num);
			System.out.println("Square root of " +num + " is: " + sroot);
			
			roerr = num-(sroot*sroot);
			System.out.println("Rounding error is: " +roerr);
			System.out.println();
		}
	}

}
