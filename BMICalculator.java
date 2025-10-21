package codegnan.controlstatements.com;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter weight in kilograms:");
		double weight = scanner.nextDouble();
		
		System.out.println("Enter height in meters:");
		double height = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI: " + String.format("%.2f", bmi));
		
		if(bmi < 18.5) {
			System.out.println("Category: Underweight");
		}
		else if(bmi < 25.0) {
			System.out.println("Category: Normal");
		}
		else if(bmi < 30.0) {
			System.out.println("Category: Overweight");
		}
		else {
			System.out.println("Category: Obese");
		}
		
		scanner.close();
	}
}
