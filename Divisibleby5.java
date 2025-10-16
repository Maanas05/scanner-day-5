package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Divisibleby5 {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int number = scanner.nextInt();
		
		String result = (number %5==0) ? "divisible by 5" : "not divisible by 5";
		
		System.out.println(result);
		
		scanner.close();
		
	}

}
