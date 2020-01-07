  
public class ClassDemo {

	static String str2 = "Hi There!!!";
	
	public static void main(String[] args) {
		

		//String str1 = "Hello Java";
		//System.out.println(str1);
		
		for (int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
		
		System.out.println("------------------------------------------------");
		
		CarClass c1 = new CarClass();
		
		//c1.model = "Maruti";
		//c1.year = 2015;
		System.out.println(c1.year);
	}

}

class CarClass {
	
	int year = 2000;
	String model;
}