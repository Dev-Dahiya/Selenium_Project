package test;

public class Loopy {

public static void main (String[] args) {
int x = 1;
System.out.println("This is before loop");

while (x < 4) {
	System.out.println("Value of x is: " + x);
	x = x + 1;
}

System.out.println("Value is x after loop is: " + x); 

}
}