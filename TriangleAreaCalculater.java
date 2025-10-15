package com.codegnan.fundamentals;

import java.util.Scanner;

public class TriangleAreaCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the base of the triangle: ");
		double base = scanner.nextDouble();
		System.out.println("Enter the height of the triangle : ");
		double height = scanner.nextDouble();
		double area =0.5*base*height;
		System.out.println("Area of Triangle : "+area);
		scanner.close();

	}

}
