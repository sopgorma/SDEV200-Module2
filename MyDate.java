/*
 Sophia Gorman
 SDEV200 - Assignment 10.14
 3/29/2025
 */

 //Imports Gregorian Calendar
import java.util.GregorianCalendar;

public class MyDate {
	//Each data field is input
	private int year;
	private int month;
	private int day;

	//Creates a date for today
	MyDate() {
		GregorianCalendar calander = new GregorianCalendar();
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	}

    //Specified elasped time with a long integer 
	MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	//The next arguments return year, month, and day
	public int getYear() {
		return year;
	}

	public String getMonth() {
		String m = String.valueOf(month + 1);
		return (month < 10 ? "0" + m : m);
	}

	public String getDay() {
		String d = String.valueOf(day);
		return (day < 10 ? "0" + d : d);
	}

	//Creates a new date
	public void setDate(long elapsedTime) {
		GregorianCalendar calander = new GregorianCalendar();
		calander.setTimeInMillis(elapsedTime);
		year = calander.get(GregorianCalendar.YEAR);
		month = calander.get(GregorianCalendar.MONTH);
		day = calander.get(GregorianCalendar.DAY_OF_MONTH);
	} 
}
