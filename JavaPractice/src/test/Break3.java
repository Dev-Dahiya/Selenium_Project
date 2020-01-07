package test;

public class Break3 {
	public static void main(String[] args) {
		
//		for(int i=0; i<3; i++) {
//			System.out.println("Outer loop count: " +i);
//			System.out.print("   Inner loop count: ");
//			
//			int t = 0;
//			while(t<100){
//				if(t == 10) break;
//				System.out.print(t + " ");
//				t++;
//			}
//			System.out.println();
//		}
//		System.out.println("Loops complete.");
		int i = 2;
		int j = 0;
		
		switch(i) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			while(j<=3){
				System.out.println("case 2");
				j++;
//				break;
			}
			break;
		case 3:
			System.out.println("case 3");
			break;
		}
	}

}
