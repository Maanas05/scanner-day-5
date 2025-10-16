package com.codegnan.fundamentals;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the principal: ");
		
		double Principal = scanner.nextDouble();
		
		System.out.println("Enter rate of interest% : ");
		
		double rateOfInterest = scanner.nextDouble();
		
		System.out.println("Enter the time (in years) : ");
		
		double Time =scanner.nextDouble() ;
		
		double simpleinterest = Principal * rateOfInterest * Time / 100;
		
		System.out.println("Simple Interest: "+simpleinterest);
		
		double totalamount = Principal + simpleinterest;
		
		System.out.println("total amount: "  +totalamount);
		
		
		scanner.close();
		
		
		
		
		
		

	}

}
