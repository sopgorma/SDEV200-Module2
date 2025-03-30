/*
 Sophia Gorman
 SDEV200 - Assignment 12.9
 3/30/2025
 */

import java.util.Scanner;

public class Bin2Dec {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//Allows user to input binary
		System.out.print("Enter a binary: ");
		try {
			System.out.println(ChapterTwelve.bin2Dec(input.nextLine()));
		}
		catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
