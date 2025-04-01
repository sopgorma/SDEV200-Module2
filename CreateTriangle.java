/*
 Sophia Gorman
 SDEV200 - Assignment 11.1
 3/30/2025
 */
import java.util.Scanner;

public class CreateTriangle {
	public static void main(String[] args) {
		//Allows user to input sides, color, and whether or not the triangle is filled
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three side of the triangle: ");
		double side1 = input.nextDouble();		
		double side2 = input.nextDouble();		
		double side3 = input.nextDouble();

		System.out.print("Enter a color: ");
		String color = input.next();

		// Prompt the user to enter whether the triangle is filled
		System.out.print("Is the triangle filled (true / false)? ");
		boolean filled = input.nextBoolean();

		/* Create triangle object with user input. 
		This part was giving me some trouble, unfortunately. */
		Triangle triangle = new Triangle(side1, side2, side3);
		triangle.setColor(color);
		triangle.setFilled(filled);

		System.out.println(triangle.toString());
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor());
		System.out.println("Triangle is " + (triangle.isFilled() ? "" : " not ") 
			+ "filled");
	}
}
