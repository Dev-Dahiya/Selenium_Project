package test;

public class Sound {
	public static void main(String[] args){
		double speed, time, distance;
		speed = 1100;
		time = 7.2;
		distance = speed*time;
		
		System.out.println("Listner is " + distance + " feet away from lightning strike.");
		
		double r_dist, e_time, e_speed;
		e_speed = 1100;
		e_time = 3 / 2.0;
		r_dist = e_speed * e_time;
		
		System.out.println("Distance of rock wall is " + r_dist);
		long a;
		a = 2147483648L;
		float b, c;
		double d;
		b = 9999.99f;
		c = 99.23876519f;
		d = b * c;
		System.out.println(d);
		byte e;
		e = 127;
		char f;
		f = 5;
		System.out.println("value of f " + f);
		long g;
		g = 5;
		long k;
		k = 12_34_51_234;
		System.out.println(k);

	}

}
