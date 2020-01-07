package test;
import java.util.Arrays;
import java.util.Random;

public class ArraysDemo3 {

	public static int inRange(int[] a, int low, int high) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= low && a[i] < high) {
				count++;
			}
		}
		return count;
	}
public static int[] randomArray(int size){
	Random random = new Random();
	int[] b = new int[size];
	for(int i = 0; i < b.length; i++){
		b[i] = random.nextInt(10);
	}
	return b;
}

public static void main(String[] args){
	//System.out.println(Arrays.toString(randomArray(6)));
	
	int[] scores = randomArray(5);
	System.out.println(Arrays.toString(scores));
	int a = inRange(scores, 90, 100);
	int b = inRange(scores, 80, 90);
	int c = inRange(scores, 70, 80);
	int d = inRange(scores, 60, 70);
	int f = inRange(scores, 0, 60);
	//System.out.println(a +" " +b + " " +c + " " +d + " " +f);
	
	/*int[] counts = new int[10];
	for(int i = 0; i < counts.length; i++){
		counts[i] = inRange(scores, i, i+1);
	}
	System.out.println(Arrays.toString(counts));*/
	for(int value : scores){
		
		System.out.println(value);
	}
}


}
