package com.codegnan.fundamentals;

import java.util.Scanner;

public class CompoundandSimpleinterest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 
		System.out.println("Enter the Principal amount: ");
		
		double principal= scanner.nextDouble();
		
		System.out.println("Enter the rate of interest: ");
		
		double interest = scanner.nextDouble();
		
		System.out.println("Enter Time in months: ");
		
		int months = scanner.nextInt();
		
		double years = (months/12.0);
		
		double simpleinterest = principal*interest*years/100;
		
		double amount = simpleinterest + principal;
		
		System.out.println(" Intrest calculations");
		
		System.out.println("Time in years: "+years);
		
		System.out.println("Simple interest : " +simpleinterest + "\nTotal amount :  "+amount);
		
		double amount1 = principal*Math.pow((1+interest/100),years );
		
		double compoundinterest= amount1-principal;
		
		System.out.println("Compound interest : "+compoundinterest +"\nTotal amount : "+amount1);
		
		scanner.close();
		
	}

}
