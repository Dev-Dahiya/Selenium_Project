package test;

public class Empty3 {
	public static void main(String[] args){
		int i;
		int sum = 0;
		
		for(i=1; i<=5; sum=sum+i, i++);
//		for(i=1; i<=5; sum += i++);
//		for(i=1; i<=5; sum += ++i);

		System.out.println("Sum is " +sum);
	}

}
//0	2
//2	5
//5	9
//9	14
//14	20