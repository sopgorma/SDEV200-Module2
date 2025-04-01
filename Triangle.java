/*
 Sophia Gorman
 SDEV200 - Assignment 11.1
 3/30/2025
 */

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	//Default triangle
	Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	// Creates specific sides of the triangle
	Triangle(double side1, double side2, double side3) { 
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	//Next methods return sides, area, and perimeter.
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	//Outputs the sides, area, and perimeter
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
			" side3 = " + side3;
	}
}