package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Checkingnumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int number = scanner.nextInt();
		
		String result = (number >0 )? "positive" :
			(number<0)? "negative" : "Zero";
		
		System.out.println("the number is" + result);
		
		scanner.close();
		
		

	}

}
