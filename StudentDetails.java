package com.codegnan.fundamentals;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the student name: ");
		String name=scanner.nextLine();
		System.out.println("Enter roll number: ");
		int rollNumber = scanner.nextInt();
		System.out.println("student age: ");
		int Age=scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Enter garde: ");
		String grade = scanner.nextLine();
		
		
		System.out.println("\n======Student Details======");
		System.out.println("Name            = " +name);
		System.out.println("Roll Number= " +rollNumber);
		System.out.println("Age               = " +Age);
		System.out.println("Grade            = "+grade);
		scanner.close();
		

	}

}
