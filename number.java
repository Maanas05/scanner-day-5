package com.codegnan.operatorexamples;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the number: ");
		
		int number=scanner.nextInt();
		
		String type = (number > 0)? "Positive" : (number < 0)? "Negative":"Zero";
		
		System.out.println(type);
		
		scanner.close();

	}

}
