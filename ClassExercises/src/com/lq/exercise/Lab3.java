package com.lq.exercise;

/**
 * @author Jessita
 * Lab 3: Flow control Challenge
 * 1) For loop
 * 2) While loop and continue statement
 * 3) For loop
 * 4) switch statement
 * 5) Hard challenge
 */
public class Lab3 {
	
	public static void main(String[] args) {
		// Exercise 1) For loop in standard and for-each, then write one that print out reverse
		
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		System.out.print("Standard for loop printout: ");
		for(int i = 0; i < daysOfWeek.length; i++) {
			System.out.print(daysOfWeek[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("for-each loop printout: ");
		for(String i: daysOfWeek) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.print("for-each loop printout reverse: ");
		for(int i = daysOfWeek.length -1; i >= 0; i--) {
			System.out.print(daysOfWeek[i] + " ");
		}
		
		//Exercise 2) Use while loop, if statement, and continue state to print out even numbers between 1 and 20
		System.out.println();
		System.out.print("While loop: ");
		int n = 1;
		
		while (n <= 20) {
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
			n++;
		}
		
		//Exercise 3) use a for loop to print number 1 to 100 except 50 through 60
		System.out.println();
		System.out.print("Exercise 3: ");
		
		for (int i = 0; i <=100; i++) {
			if(i <= 60 && i >= 50) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		//Exercise 4: Switch statement in a while loop
		String[] monthNames = {"January", "Februray", "March", "April", "May", "June","July","August","September","October","November","December"};
		int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println();
		System.out.println("Exercise 4: ");
		
		int x = 0;
		
		while (x < monthNames.length) {
			int days = daysInMonths[x];
			
			switch(days) {
			case 30: 
				System.out.println(monthNames[x] + " "+ daysInMonths[x]);
				break;
			case 31: 
				System.out.println(monthNames[x] + " "+ daysInMonths[x]);
				break;
			default:
				System.out.println(monthNames[x] + " "+ daysInMonths[x]);
				break;
			}
			x++;
		}
		
		//Hard Challenge: Print out March in a calendar format with start printing 1 on Friday and new line on Saturday
		System.out.println();
		System.out.println("Exercise 5: The Month of March");
		
		String[] dateOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		for(String i: dateOfWeek) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		int date = 1;
		
		while(date <= 31) {
			if(date == 1) {
				System.out.print("                    "+ date);
			}else if(date == 2) {
				System.out.print("    "+ date + "\n");
			}else if(date == 9) {
				System.out.print(" "+date + "\n");
			}else if(date == 16) {
				System.out.print(date + "\n");
			}else if(date == 23) {
				System.out.print(date + "\n");
			}else if(date == 30) {
				System.out.print(date + "\n");
			}else if(date >= 3 && date <= 9) {
					System.out.print(date + "   ");
			}else {
				System.out.print(date + "  ");
			}
			date++;
		}
		
	}
}
