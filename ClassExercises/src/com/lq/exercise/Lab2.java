
package com.lq.exercise;

/**
 * @author Jessita
 * Challenges:
 * 1. print "Hello World!"
 * 2. Define Primitive Data Types
 * 3. Define Arrays and use loop to print out month and day
 *
 */
public class Lab2 {
 // Define Primitive Data types as global variable using static keyword
	static int width, height, area;
	static double radius = 10.0, pi = 3.14;
	static boolean result = true;

// Define Array and declare it as global variable wiith static
	static String[] monthNames = {"January", "Februray", "March", "April", "May", "June","July","August","September","October","November","December"};
	static int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};

	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		width = 8;
		height = 12;
		area = 96;
		
		System.out.println("The value of width is "+ width);
		System.out.println("The value of height is "+ height);
		System.out.println("The value of area is "+ area);
		System.out.println("The value of radius is "+ radius);
		System.out.println("The value of pi is "+ pi);
		System.out.println("The value of result is "+ result);
		
		for (int i =0; i < monthNames.length; i++) {
			System.out.println(monthNames[i]+ " has "+ daysInMonths[i]+ " days.");
		}
	}

}
