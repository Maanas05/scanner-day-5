package com.codegnan.operatorexamples;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int number = scanner.nextInt();
		
		String result =( number%2==0)?"Even" : "Odd";
		
		System.out.println(result);
		
		scanner.close();

	}

}
