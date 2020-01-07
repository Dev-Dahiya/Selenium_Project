package test;

public class Double_Method {
	public static double distance(double x1, double y1, double x2, double y2) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		double dsquared = dx * dx + dy * dy;
		double result = Math.sqrt(dsquared);
		return result;
	}

	public static void main(String[] args) {
		double result = circleArea(1.0, 2.0, 4.0, 6.0);
		System.out.println("Area of the circle is: " + result);
		
	}

	public static double calculateArea(double radius) {
		double result = Math.PI * radius * radius;
		return result;
		// return Math.PI*radius*radius;
	}
	
	public static double circleArea(double xc, double yc, double xp, double yp) {
		//double radius = distance(xc, yc, xp, yp);
		//double area = calculateArea(radius);
		return calculateArea(distance(xc, yc, xp, yp));
		}
}
