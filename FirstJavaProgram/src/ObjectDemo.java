
public class ObjectDemo {

	public static void main(String[] args) {
		
		CarCla c1 = new CarCla();
		/*c1.year = 2015;
		c1.model = "BMW";*/
		
		
		System.out.println(c1.year);
		System.out.println(c1.model);
		
		}

}



class CarCla {
	
	int year = 2000;
	String model = "Audi";
	
}