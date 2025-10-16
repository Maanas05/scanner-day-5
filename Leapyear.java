package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int year = scanner.nextInt();
		String result = (year%4==0 &&  year % 100 !=0 || year % 400 == 0 )? "Leap year" : "not a leap year";
		
		System.out.println(result);
		
		scanner.close();
		
		

	}

}
