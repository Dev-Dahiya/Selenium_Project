public class Car {
	private String make;
	int speed;
	int gear;
	
	
	public Car() {
	this.speed = 0;
	this.gear= 1;
	
		
	}
	
	public void setMake(String make){
		this.make = make;
		
		
	}
	
	public String getMake(){
		return make;
		
	}
}
