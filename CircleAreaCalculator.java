package com.codegnan.fundamentals;

import java.util.Scanner;

public class CircleAreaCalculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the radius of the circle: ");
		
		float radius = scanner.nextFloat();
		
		double area=3.141*radius*radius;
		
		System.out.println("Area of the circle : "+area );
		
		scanner.close();
	}

}
