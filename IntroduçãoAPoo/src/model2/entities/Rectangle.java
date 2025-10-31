package model2.entities;

public class Rectangle {
	
	public static double w;
	public static double h;
	
	public static double area() {
		return w*h;
	}
	public static double perimeter() {
		return 2*(w+h);
	}
	public static double diagonal() {
		return Math.sqrt(h*h + w*w);
	}
}