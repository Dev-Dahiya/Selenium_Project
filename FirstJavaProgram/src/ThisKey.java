
public class ThisKey {

	public static void main(String[] args) {
		CarNew c1 = new CarNew();
		
		c1.setMake("audi");
		System.out.println(c1.getMake());
		
		//c2.setMake("honda");
		//System.out.println(c2.getMake());
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		System.out.println("***************************");
		
		CarNew c2 = new CarNew(10, 2);
		System.out.println(c2.speed);
		System.out.println(c2.gear);
		
	}

}
