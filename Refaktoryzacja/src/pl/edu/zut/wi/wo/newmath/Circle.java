package pl.edu.zut.wi.wo.newmath;

public class Circle {
	public static double circum(double radius) {
		return 2 * Math.PI * radius;
	}
	
	public static void main(String[] params) {
		System.out.println(String.format("circumference of radius 2 equals %f", Circle.circum(2)));
	}
}
